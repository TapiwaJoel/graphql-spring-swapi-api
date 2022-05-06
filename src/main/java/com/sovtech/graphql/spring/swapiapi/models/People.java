package com.sovtech.graphql.spring.swapiapi.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class People {
    String name;
    String height;
    String mass;
    String gender;
    String homeworld;
}
