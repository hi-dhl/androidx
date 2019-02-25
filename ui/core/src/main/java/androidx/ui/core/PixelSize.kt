/*
 * Copyright 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package androidx.ui.core

import androidx.ui.engine.geometry.Rect

/**
 * A size in Pixels
 */
data class PixelSize(val width: Float, val height: Float)

/**
 * Convert a [PixelSize] to a [Rect].
 */
fun PixelSize.toRect(): Rect {
    return Rect(0f, 0f, width, height)
}
