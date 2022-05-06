package com.sovtech.graphql.spring.swapiapi.utils;

public enum QueryStrings {
    page("page"),
    search("search");

    public final String label;

    QueryStrings(String label) {
        this.label = label;
    }
}
