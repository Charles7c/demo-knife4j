/*
 * Copyright (c) 2022-present Charles7c Authors. All Rights Reserved.
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

package com.example.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 接口文档配置
 *
 * @author Charles7c
 * @since 2022/12/11 19:14
 */
@Configuration
@RequiredArgsConstructor
@ConditionalOnProperty(name = "springdoc.swagger-ui.enabled", havingValue = "true", matchIfMissing = true)
public class SwaggerConfiguration {

    private final SwaggerProperties swaggerProperties;

    /**
     * 接口文档配置
     */
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI().info(
            new Info().title(swaggerProperties.getName() + " 接口文档").version(swaggerProperties.getVersion())
                .description(swaggerProperties.getDescription()).termsOfService(swaggerProperties.getUrl())
                .contact(swaggerProperties.getAuthor()).license(swaggerProperties.getLicense()));
    }
}
