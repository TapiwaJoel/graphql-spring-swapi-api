package com.sovtech.graphql.spring.swapiapi.utils;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(locations = "classpath:application.properties")
public class UtilsTests {

    @Value("${swapi.url}")
    private String swapiUrl;

    @Test
    void buildUriShouldReturnCorrectUrlWhenPageIsEntered() {
        String pageUri = Utils.buildUri(QueryStrings.page, "1", swapiUrl, swapiUrl);
        assertThat(pageUri).isEqualTo(swapiUrl + "?page=1");
    }

    @Test
    void buildUriShouldReturnCorrectUrlWhenSearchIsEntered() {
        String searchUri = Utils.buildUri(QueryStrings.search, "Luke Skywalker", swapiUrl, swapiUrl);
        assertThat(searchUri).isEqualTo(swapiUrl + "?search=Luke Skywalker");
    }

    @Test
    void buildUriShouldThrowAnExceptionWhenInvalidUrlIsEnterAndReturnDefaultUrl() {
        String searchUri = Utils.buildUri(QueryStrings.search, "Luke Skywalker", "swapiUrl", swapiUrl);
        System.out.println(searchUri);
        assertThat(searchUri).isEqualTo(swapiUrl);
    }
}
