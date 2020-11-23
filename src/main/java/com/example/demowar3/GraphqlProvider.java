package com.example.demowar3;


import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;

import org.springframework.core.io.Resource;

@Component
public class GraphqlProvider {

    @Value("classpath:schema.graphql")
    Resource resource;


    @Autowired
    ApiService apiService;




    private GraphQL graphQL;



    @Bean
    public GraphQL graphQL()
    {
        return graphQL;
    }

    @PostConstruct
    public void init() throws IOException
    {
        File schemaFile = resource.getFile();
        GraphQLSchema graphQLSchema = buildSchema(schemaFile);
        this.graphQL = GraphQL.newGraphQL(graphQLSchema).build();
    }

    private GraphQLSchema buildSchema(File schema){
        TypeDefinitionRegistry typeDefinitionRegistry = new SchemaParser().parse(schema);
        RuntimeWiring runtimeWiring = buildRuntime();
        SchemaGenerator schemaGenerator = new SchemaGenerator();
        return  schemaGenerator.makeExecutableSchema(typeDefinitionRegistry, runtimeWiring);
    }

    private RuntimeWiring buildRuntime(){
        return RuntimeWiring.newRuntimeWiring()
                .type(queryBuilder())
                .type(queryApiCount())
                .type(queryBusinessInformation())
                .type(queryApiEndPointUrlsInformation())
                .type(queryAPIURLsDTO())
                .type(queryPagination())
                .build();
    }


    private TypeRuntimeWiring.Builder queryBuilder(){
        return TypeRuntimeWiring.newTypeWiring("Query")
                .dataFetcher("getApis",apiService.getApis());
    }
    private TypeRuntimeWiring.Builder queryApiCount(){
        return TypeRuntimeWiring.newTypeWiring("Query")
                .dataFetcher("getApisCount",apiService.getApiCount());
    }
    private TypeRuntimeWiring.Builder queryBusinessInformation(){
        return TypeRuntimeWiring.newTypeWiring("Api")
                .dataFetcher("businessInformation",apiService.getBusinessInformation());
    }

    private TypeRuntimeWiring.Builder queryApiEndPointUrlsInformation(){
        return TypeRuntimeWiring.newTypeWiring("Api")
                .dataFetcher("apiEndPointInformation",apiService.getApiUrlsEndPoint());
    }
    private TypeRuntimeWiring.Builder queryAPIURLsDTO(){
        return TypeRuntimeWiring.newTypeWiring("APIEndpointURLsDTO")
                .dataFetcher("urLs",apiService.getApiUrlsDTO());
    }
    private TypeRuntimeWiring.Builder queryPagination(){
        return TypeRuntimeWiring.newTypeWiring("Query")
                .dataFetcher("getPagination", apiService.getPagination());
    }
}
