package com.example.demowar3.modules;

public class APIURLsDTO {
    private String apiID;
    private String http;
    private String https;
    private String ws;
    private String wss;

    public APIURLsDTO(String apiID, String http, String https, String ws, String wss) {
        this.apiID = apiID;
        this.http = http;
        this.https = https;
        this.ws = ws;
        this.wss = wss;
    }

    public String getApiID() {
        return apiID;
    }
}
