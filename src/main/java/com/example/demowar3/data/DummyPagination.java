package com.example.demowar3.data;

import com.example.demowar3.modules.APIEndpointURLsDTO;
import com.example.demowar3.modules.Pagination;

import java.util.Arrays;
import java.util.List;

public class DummyPagination {

    List<Pagination> paginationList = Arrays.asList(
            new Pagination(1,25,2,"x1","x1")
    );

    public List<Pagination> apiPagination(){
        return paginationList;
    }
}
