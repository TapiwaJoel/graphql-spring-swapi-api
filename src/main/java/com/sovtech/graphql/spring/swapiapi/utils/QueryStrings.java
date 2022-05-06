package com.sovtech.graphql.spring.swapiapi.utils;

public enum QueryStrings {
    Page("page"),
    Search("search");

    public final String label;

    private QueryStrings(String label) {
        this.label = label;
    }
}
