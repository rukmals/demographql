package com.example.demowar3;

import com.example.demowar3.data.*;
import com.example.demowar3.modules.APIEndpointURLsDTO;
import com.example.demowar3.modules.Api;
import graphql.schema.DataFetcher;
import org.springframework.stereotype.Component;


@Component
public class ApiService {

    DummyApi dummyApi = new DummyApi();
    DummyBusinessInformation dummyBusinessInformation = new DummyBusinessInformation();
    DummyAPIEndpointURLsDTO dummyAPIEndpointURLsDTO = new DummyAPIEndpointURLsDTO();
    DummyAPIUrlsDTO dummyAPIUrlsDTO = new DummyAPIUrlsDTO();
    DummyPagination dummyPagination = new DummyPagination();


    public DataFetcher getApis(){
        return env-> dummyApi.getAllApis();

    }
    public DataFetcher getApiCount(){
        return env-> dummyApi.getApiCount();
    }
    public DataFetcher getBusinessInformation(){

        return env-> {
            Api api = env.getSource();
            return dummyBusinessInformation.getBusinessInformations(api.getId());
        };
    }

    public DataFetcher getApiUrlsEndPoint(){
        return env->{
            Api api = env.getSource();
            return dummyAPIEndpointURLsDTO.apiEndpointURLsDTO(api.getId());

        };
    }
    public DataFetcher getApiUrlsDTO(){
        return env ->{
            APIEndpointURLsDTO api = env.getSource();
            return dummyAPIUrlsDTO.apiURLsDTO(api.getApiId());

        };
    }

    public DataFetcher getPagination(){
        return env-> dummyPagination.apiPagination();
    }
}
