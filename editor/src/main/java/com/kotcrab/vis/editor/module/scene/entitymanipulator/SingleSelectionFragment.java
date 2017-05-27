/*
 * Copyright 2014-2017 See AUTHORS file.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kotcrab.vis.editor.module.scene.entitymanipulator;

import com.badlogic.gdx.math.Rectangle;
import com.kotcrab.vis.editor.proxy.EntityProxy;

/** @author Kotcrab */
public class SingleSelectionFragment implements SelectionFragment {
	private final EntityProxy proxy;

	public SingleSelectionFragment (EntityProxy proxy) {
		this.proxy = proxy;
	}

	@Override
	public Rectangle getBoundingRectangle () {
		return proxy.getBoundingRectangle();
	}

	public EntityProxy getProxy () {
		return proxy;
	}

	@Override
	public boolean equals (Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		SingleSelectionFragment that = (SingleSelectionFragment) o;

		return proxy.equals(that.proxy);
	}

	@Override
	public int hashCode () {
		return proxy.hashCode();
	}
}
