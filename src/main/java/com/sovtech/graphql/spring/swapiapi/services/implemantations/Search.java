package com.sovtech.graphql.spring.swapiapi.services.implemantations;

import com.sovtech.graphql.spring.swapiapi.services.interfaces.SearchInterface;
import com.sovtech.graphql.spring.swapiapi.utils.QueryStrings;
import com.sovtech.graphql.spring.swapiapi.utils.Response;
import com.sovtech.graphql.spring.swapiapi.utils.Utils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Search implements SearchInterface {

    @Value("${swapi.url}")
    private String swapiUrl;

    private final RestTemplate restTemplate;


    public Search(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Response getPeople(String page) {
        return restTemplate.getForObject(
                Utils.buildUri(
                        QueryStrings.page,
                        page == null ? "1" : page,
                        swapiUrl,
                        swapiUrl
                ),
                Response.class);
    }

    @Override
    public Response searchByName(String name) {
        return restTemplate.getForObject(
                Utils.buildUri(
                        QueryStrings.search,
                        name,
                        swapiUrl,
                        swapiUrl
                ),
                Response.class);
    }
}
