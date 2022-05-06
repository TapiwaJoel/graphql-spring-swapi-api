package com.sovtech.graphql.spring.swapiapi.utils;

import com.sovtech.graphql.spring.swapiapi.models.People;
import lombok.*;

import java.util.List;


public class Response {
    int count;
    String next;
    String previous;
    List<People> results;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public List<People> getResults() {
        return results;
    }

    public void setResults(List<People> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Response{" +
                "count=" + count +
                ", next='" + next + '\'' +
                ", previous='" + previous + '\'' +
                ", results=" + results +
                '}';
    }
}
