package com.example.demowar3.data;

import com.example.demowar3.modules.Api;

import java.util.Arrays;
import java.util.List;

public class DummyApi {


    List<Api> apis = Arrays.asList(
            new Api("1", "A","1.0.0"),
            new Api("2","B","1.0.0")
    );

    public List<Api> getAllApis(){
        return apis;
    }

    public int getApiCount(){
        return apis.size();
    }




}
