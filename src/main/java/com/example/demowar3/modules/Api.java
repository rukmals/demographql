package com.example.demowar3.modules;


import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;


public class Api {
    private String id;
    private String name;
    private String version;

    public Api(String id, String name, String version) {
        this.id = id;
        this.name = name;
        this.version = version;
    }

    public String getId() {
        return id;
    }
}
