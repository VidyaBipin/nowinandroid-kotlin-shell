/*
 * Copyright 2024 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.apps.nowinandroid.initializer

import android.content.Context
import android.util.Log
import androidx.startup.Initializer
import com.google.samples.apps.nowinandroid.util.ProfileVerifierLogger
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job

/**
 * Startup initializer for [ProfileVerifierLogger]
 */
class ProfileVerifierLoggerInitializer: Initializer<ProfileVerifierLogger> {
    override fun create(context: Context): ProfileVerifierLogger {
        return ProfileVerifierLogger(scope = CoroutineScope(Dispatchers.Default + Job())).apply {
            this()
        }
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return mutableListOf()
    }
}
