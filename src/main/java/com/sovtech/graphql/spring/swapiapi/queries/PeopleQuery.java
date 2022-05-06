package com.sovtech.graphql.spring.swapiapi.queries;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.sovtech.graphql.spring.swapiapi.services.interfaces.SearchInterface;
import com.sovtech.graphql.spring.swapiapi.utils.Response;
import org.springframework.stereotype.Component;

@Component
public class PeopleQuery implements GraphQLQueryResolver {

    final SearchInterface searchInterface;

    public PeopleQuery(SearchInterface searchInterface) {
        this.searchInterface = searchInterface;
    }

    public Response people(String next) {
        return searchInterface.getPeople(next);
    }

    public Response search(String name) {
        return searchInterface.searchByName(name);
    }
}
