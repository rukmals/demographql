package com.example.demowar3;


import graphql.schema.DataFetcher;
import org.springframework.stereotype.Component;

@Component
public class BookService {


    DummyBook dummyBook = new DummyBook();


    public DataFetcher getBooks(){
        return env-> dummyBook.getAllBooks() ;

    }
}
