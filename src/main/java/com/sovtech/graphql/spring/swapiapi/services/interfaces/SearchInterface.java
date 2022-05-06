package com.sovtech.graphql.spring.swapiapi.services.interfaces;

import com.sovtech.graphql.spring.swapiapi.utils.Response;

public interface SearchInterface {
    Response getPeople(String next);

    Response searchByName(String name);
}
