package com.sovtech.graphql.spring.swapiapi.utils;

import com.sovtech.graphql.spring.swapiapi.models.People;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {
    int count;
    String next;
    String previous;
    List<People> results;
}
