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

    public Response people() {
        return searchInterface.getPeople(0);
    }

}
