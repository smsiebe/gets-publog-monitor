/*
 * Copyright 2016 geoint.org.
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
package org.geoint.gets.publog.monitor;

import org.geoint.terpene.task.Task;

/**
 * Monitors a publog for report publication changes.
 */
@Task(name = "Publog Monitor",
        schedule = "*/15 * * * *",
        description = "Publishes report publication change events for changes"
        + " observed on publog.",
        autostart = true)
public class PublogMonitor implements Runnable {

    @Override
    public void run() {

    }

}
