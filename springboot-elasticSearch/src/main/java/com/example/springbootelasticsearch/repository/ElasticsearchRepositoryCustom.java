package com.example.springbootelasticsearch.repository;

import com.example.springbootelasticsearch.documents.Product;
import com.example.springbootelasticsearch.service.ElasticProductService;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ElasticsearchRepositoryCustom {

    Product save();
    Product findById();

}
