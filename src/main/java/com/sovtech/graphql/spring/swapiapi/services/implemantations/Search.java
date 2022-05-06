package com.sovtech.graphql.spring.swapiapi.services.implemantations;

import com.sovtech.graphql.spring.swapiapi.services.interfaces.SearchInterface;
import com.sovtech.graphql.spring.swapiapi.utils.Response;
import org.springframework.stereotype.Service;

@Service
public class Search implements SearchInterface {
    @Override
    public Response getPeople(int page) {
        return null;
    }

    @Override
    public Response searchByName(String name) {
        return null;
    }
}
