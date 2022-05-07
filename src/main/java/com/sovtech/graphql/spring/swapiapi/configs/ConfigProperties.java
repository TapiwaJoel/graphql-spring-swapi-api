package com.sovtech.graphql.spring.swapiapi.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Configuration
@ConfigurationProperties(prefix = "swapi")
public class ConfigProperties {

//    @Autowired
//    private Environment env;
//
//    public String getConfigValue(String configKey){
//        return env.getProperty(configKey);
//    }

    private String url;


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}