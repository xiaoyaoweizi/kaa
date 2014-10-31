/*
 * Copyright 2014 CyberVision, Inc.
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

package org.kaaproject.kaa.server.common.dao.impl;

import java.util.List;

/**
 * The interface Profile schema dao.
 * @param <T>  the type parameter
 */
public interface ProfileSchemaDao<T> extends Dao<T> {

    /**
     * Find profile schemas by application id.
     *
     * @param applicationId the application id
     * @return the list of profile schemas
     */
    List<T> findByApplicationId(String applicationId);

    /**
     * Find profile schema by application id and version.
     *
     * @param applicationId the application id
     * @param version the version of profile schema
     * @return the profile schema
     */
    T findByAppIdAndVersion(String applicationId, int version);

    /**
     * Find latest profile schema by application id.
     *
     * @param applicationId the application id
     * @return the profile schema
     */
    T findLatestByAppId(String applicationId);

    /**
     * Find vacant profile schemas.
     *
     * @param applicationId the application id
     * @param usedSchemaIds the used schema ids
     * @return the list of profile schemas
     */
    List<T> findVacantSchemas(String applicationId, List<String> usedSchemaIds);
}