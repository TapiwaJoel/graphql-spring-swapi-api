package com.sovtech.graphql.spring.swapiapi.services.implemantations;

import com.sovtech.graphql.spring.swapiapi.services.interfaces.SearchInterface;
import com.sovtech.graphql.spring.swapiapi.utils.QueryStrings;
import com.sovtech.graphql.spring.swapiapi.utils.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class Search implements SearchInterface {

    @Value("${swapi.url.all.people}")
    private String swapiUrl;

    private final RestTemplate restTemplate;

    public Search(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Response getPeople(String next) {
        return restTemplate.getForObject(buildUri(
                QueryStrings.Page,
                next == null ? "1" : next
                ),
                Response.class);
    }

    @Override
    public Response searchByName(String name) {
        return restTemplate.getForObject(
                buildUri(QueryStrings.Search, name),
                Response.class);
    }

    private String buildUri(QueryStrings key, String value) {
        try {
            String param = key == QueryStrings.Page ?
                    QueryStrings.Page.toString() : QueryStrings.Search.toString();
            return UriComponentsBuilder.fromHttpUrl(swapiUrl)
                    .queryParam(param.toLowerCase(), value).build().toUriString();

        } catch (IllegalArgumentException illegalArgumentException) {
            illegalArgumentException.printStackTrace();
            return swapiUrl;
        }
    }
}
