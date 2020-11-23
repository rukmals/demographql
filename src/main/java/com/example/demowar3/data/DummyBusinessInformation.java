package com.example.demowar3.data;

import com.example.demowar3.modules.BusinessInformation;

import java.util.Arrays;
import java.util.List;

public class DummyBusinessInformation {

    List<BusinessInformation> businessInformations = Arrays.asList(
            new BusinessInformation("1","Rukmal","rukmals@wso2.com","Tharindu","tharindus@wso2.com"),
            new BusinessInformation("2","Ruka","ruka@wso2.com","Thariya","thariya@wso2.com")
    );

    public BusinessInformation getBusinessInformations(String Id){
        //BusinessInformation businessInformation;
        return businessInformations.stream().filter(x->x.getId().equals(Id)).findFirst().orElse(null);


    }
}
