/*
 * Copyright 2019 Santanu Sinha <santanu.sinha@gmail.com>
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
 *
 */

package io.dropwizard.sharding;

import io.dropwizard.sharding.config.ShardedHibernateFactory;

/**
 * Created by tushar.mandar on 4/25/17.
 */
public class LegacyDBShardingBundleWithAnnotationTest extends DBShardingBundleTest {

    @Override
    protected DBShardingBundleBase<TestConfig> getBundle() {
        return new DBShardingBundle<TestConfig>("io.dropwizard.sharding.dao.testdata.entities") {
            @Override
            protected ShardedHibernateFactory getConfig(DBShardingBundleTest.TestConfig config) {
                return testConfig.getShards();
            }
        };
    }
}
