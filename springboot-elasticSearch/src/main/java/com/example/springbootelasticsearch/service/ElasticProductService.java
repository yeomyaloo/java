package com.example.springbootelasticsearch.service;

import com.example.springbootelasticsearch.documents.Product;

public interface ElasticProductService {

    Product save(Product product);

    Product findById(Long id);
}
