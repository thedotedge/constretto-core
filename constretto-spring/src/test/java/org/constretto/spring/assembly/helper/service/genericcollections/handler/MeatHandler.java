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
package org.constretto.spring.assembly.helper.service.genericcollections.handler;

import static org.constretto.annotation.Environment.DEVELOPMENT;

import org.constretto.annotation.Environment;
import org.constretto.spring.assembly.helper.service.genericcollections.product.Butter;
import org.constretto.spring.assembly.helper.service.genericcollections.product.Product;
import org.springframework.stereotype.Component;

/**
 * 
 * @author <a href="mailto:kaare.nilsen@gmail.com">Kaare Nilsen</a>
 */
@Component
@Environment(DEVELOPMENT)
public class MeatHandler implements ProductHandler<Butter> {

    public void printMe(Butter product) {
        System.out.println(product.toString());
    }

    public boolean supports(Product product) {
        return product instanceof Butter;
    }

}
