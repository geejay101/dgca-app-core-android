/*
 *  ---license-start
 *  eu-digital-green-certificates / coronago.verifier.app.android
 *  ---
 *  Copyright (C) 2021 T-Systems International GmbH and all other contributors
 *  ---
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  ---license-end
 *
 *  Created by Mykhailo Nester on 4/23/21 9:49 AM
 */

object Versions {

    // Base
    const val gradle = "4.1.3"
    const val kotlin = "1.4.32"
    const val desugar_jdk_libs = "1.1.5"

    // Decoder
    const val kotlin_reflect = "1.4.32"
    const val jackson_cbor = "2.12.3"
    const val java_cose = "1.1.0"
    const val bouncy_castle = "1.68"

    // Validation
    const val json_validation = "2.2.6"
    const val json_validation_rhino = "1.0"

    // Tests
    const val junit = "4.13.1"
    const val junit_jupiter = "5.7.1"
    const val hamcrest = "2.2"
}