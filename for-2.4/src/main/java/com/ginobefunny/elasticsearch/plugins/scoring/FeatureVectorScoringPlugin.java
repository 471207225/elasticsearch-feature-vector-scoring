/*
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
package com.ginobefunny.elasticsearch.plugins.scoring;

import org.elasticsearch.common.inject.internal.Nullable;
import org.elasticsearch.plugins.Plugin;
import org.elasticsearch.script.AbstractFloatSearchScript;
import org.elasticsearch.script.ExecutableScript;
import org.elasticsearch.script.NativeScriptFactory;
import org.elasticsearch.script.ScriptModule;
import org.elasticsearch.script.ScriptException;

import java.util.Map;


public class FeatureVectorScoringPlugin extends Plugin {

    @Override
    public String name() {

        return "feature_vector_scoring_script";

    }

    @Override
    public String description() {
        return "my native script that does something great";
    }

    public void onModule(ScriptModule scriptModule) {
        scriptModule.registerScript("feature_vector_scoring_script", ScriptFactory.class);
    }


}