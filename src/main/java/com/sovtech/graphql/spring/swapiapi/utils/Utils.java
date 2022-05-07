package com.sovtech.graphql.spring.swapiapi.utils;

import org.springframework.web.util.UriComponentsBuilder;

public class Utils {

    public static String buildUri(QueryStrings key, String value, String swapiUrl, String swapiUrlDefault) {
        try {
            String param = key == QueryStrings.page ?
                    QueryStrings.page.toString() : QueryStrings.search.toString();
            return UriComponentsBuilder.fromHttpUrl(swapiUrl)
                    .queryParam(param.toLowerCase(), value).build().toUriString();
        } catch (IllegalArgumentException illegalArgumentException) {
            illegalArgumentException.printStackTrace();
            return swapiUrlDefault;
        }
    }
}
