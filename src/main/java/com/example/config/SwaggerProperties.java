package com.example.config;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.stereotype.Component;

/**
 * Swagger 配置属性
 *
 * @author Charles7c
 * @since 2022/12/28 9:27
 */
@Data
@Component
@ConfigurationProperties(prefix = "swagger")
public class SwaggerProperties {

    /**
     * 名称
     */
    private String name;

    /**
     * 应用名称
     */
    private String appName;

    /**
     * 版本
     */
    private String version;

    /**
     * 描述
     */
    private String description;

    /**
     * URL
     */
    private String url;

    /**
     * 作者信息
     */
    @NestedConfigurationProperty
    private Contact author;

    /**
     * 许可协议信息
     */
    @NestedConfigurationProperty
    private License license;

}
