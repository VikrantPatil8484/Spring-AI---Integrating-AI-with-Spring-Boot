package com.example.demo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

//this class will return the nested api response
//only return fields which we have mentioned here if there are other then that can be ignore
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeminiResponse {
    private List<Candidate> candidates;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Candidate {
        private Content content;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Content {
        private List<Part> parts;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Part {
        private String text;
    }
}
