package com.sovtech.graphql.spring.swapiapi;

import com.sovtech.graphql.spring.swapiapi.configs.ConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ConfigProperties.class)
public class GraphqlSpringSwapiApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphqlSpringSwapiApiApplication.class, args);
    }

}
