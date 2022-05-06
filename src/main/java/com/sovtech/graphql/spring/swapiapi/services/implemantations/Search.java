package com.sovtech.graphql.spring.swapiapi.services.implemantations;

import com.sovtech.graphql.spring.swapiapi.services.interfaces.SearchInterface;
import com.sovtech.graphql.spring.swapiapi.utils.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Search implements SearchInterface {

    @Value("${swapi.url.all.people}")
    private String swapiUrl;

    private final RestTemplate restTemplate;

    public Search(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Response getPeople(int page) {
        return restTemplate.getForObject(swapiUrl, Response.class);
    }

    @Override
    public Response searchByName(String name) {
        return null;
    }
}
