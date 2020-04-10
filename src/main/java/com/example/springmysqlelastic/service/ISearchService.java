package com.example.springmysqlelastic.service;

import com.example.springmysqlelastic.utils.ResultQuery;

import java.io.IOException;

public interface ISearchService {
    ResultQuery searchFromQuery(String query) throws IOException;
}
