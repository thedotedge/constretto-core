/*
 * Copyright 2008 the original author or authors.
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
package org.constretto.internal.provider;

import org.constretto.ConstrettoBuilder;
import org.constretto.ConstrettoConfiguration;
import org.springframework.core.io.ClassPathResource;

/**
 * @author <a href="mailto:kaare.nilsen@gmail.com">Kaare Nilsen</a>
 */
public class IniFileStoreLookupTest extends AbstractConfigurationProviderLookupTest {

    @Override
    public ConstrettoConfiguration prepareTests(String... tags) {
        ConstrettoBuilder constrettoBuilder = new ConstrettoBuilder();
        constrettoBuilder
                .createIniFileConfigurationStore()
                .addResource(new ClassPathResource(("org/constretto/internal/provider/helper/provider-test.ini")))
                .addResource(new ClassPathResource(("org/constretto/internal/provider/helper/provider-test-overloaded.ini")))
                .done()
                .createSystemPropertiesStore();
        for (String tag : tags) {
            constrettoBuilder.addCurrentTag(tag);
        }
        return constrettoBuilder.getConfiguration();
    }
}