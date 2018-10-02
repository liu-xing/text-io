/*
 * Copyright 2017 the original author or authors.
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
package org.beryx.textio.web;

import java.util.Collections;
import java.util.Map;

public class RunnerData {
    private final String initData;
    private Map<String, String> sessionData = Collections.emptyMap();

    public RunnerData(String initData) {
        this.initData = initData;
    }

    public String getInitData() {
        return initData;
    }

    public Map<String, String> getSessionData() {
        return sessionData;
    }
    public void setSessionData(Map<String, String> sessionData) {
        this.sessionData = sessionData;
    }
}