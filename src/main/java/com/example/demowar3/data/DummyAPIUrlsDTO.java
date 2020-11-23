package com.example.demowar3.data;

import com.example.demowar3.modules.APIEndpointURLsDTO;
import com.example.demowar3.modules.APIURLsDTO;

import java.util.Arrays;
import java.util.List;

public class DummyAPIUrlsDTO {


    List<APIURLsDTO> apiurLsDTOS = Arrays.asList(
            new APIURLsDTO("1","http/x1","https/x1","x1","x11"),
            new APIURLsDTO("2","http/x2","https/x2","x2","x22")
    );

    public APIURLsDTO apiURLsDTO(String Id){
        return apiurLsDTOS.stream().filter(x->x.getApiID().equals(Id)).findFirst().orElse(null);
    }
}
