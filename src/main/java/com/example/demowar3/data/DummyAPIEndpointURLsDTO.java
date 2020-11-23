package com.example.demowar3.data;

import com.example.demowar3.modules.APIEndpointURLsDTO;

import java.util.Arrays;
import java.util.List;

public class DummyAPIEndpointURLsDTO {

    //DummyAPIURLsDTO apiurLsDTO;
    List<APIEndpointURLsDTO> apiEndpointURLsDTOS = Arrays.asList(
            new APIEndpointURLsDTO("1","Production and Sandbox","hybrid","x1"),
            new APIEndpointURLsDTO("2","Production and Sandbox","hybrid","x2")
    );

    public APIEndpointURLsDTO apiEndpointURLsDTO(String Id){
        return apiEndpointURLsDTOS.stream().filter(x->x.getApiId().equals(Id)).findFirst().orElse(null);
    }
}
