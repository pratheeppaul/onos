/*
 * Copyright 2014 Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onlab.onos.store.service.impl;

/**
 * Interface of database update event listeners.
 */
public interface DatabaseUpdateEventListener {

    /**
     * Notifies listeners of a table modified event.
     * @param event table modification event.
     */
    public void tableModified(TableModificationEvent event);

    /**
     * Notifies listeners of a table created event.
     * @param tableName
     * @param expirationTimeMillis
     */
    public void tableCreated(String tableName, int expirationTimeMillis);

    /**
     * Notifies listeners of a table deleted event.
     * @param tableName
     */
    public void tableDeleted(String tableName);

}