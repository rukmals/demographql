package com.example.demowar3.modules;

public class BusinessInformation {

    private String id;
    private String businessOwner;
    private String businessOwnerEmail;
    private String technicalOwner;
    private String technicalOwnerEmail;

    public BusinessInformation(String id ,String businessOwner, String businessOwnerEmail, String technicalOwner, String technicalOwnerEmail) {
        this.id = id;
        this.businessOwner = businessOwner;
        this.businessOwnerEmail = businessOwnerEmail;
        this.technicalOwner = technicalOwner;
        this.technicalOwnerEmail = technicalOwnerEmail;
    }

    public String getId() {
        return id;
    }
}
