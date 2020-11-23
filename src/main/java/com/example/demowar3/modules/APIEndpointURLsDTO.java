package com.example.demowar3.modules;

public class APIEndpointURLsDTO {
    private String apiId;
    private String environmentName;
    private String environmentType;
    private String urLs;

    public APIEndpointURLsDTO(String apiId,String environmentName, String environmentType, String urLs) {
        this.apiId = apiId;
        this.environmentName = environmentName;
        this.environmentType = environmentType;
        this.urLs = urLs;
    }

    public String getApiId() {
        return apiId;
    }
}
