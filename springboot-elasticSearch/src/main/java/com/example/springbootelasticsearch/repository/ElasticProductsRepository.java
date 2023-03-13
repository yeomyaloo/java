package com.example.springbootelasticsearch.repository;


import com.example.springbootelasticsearch.documents.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.NoRepositoryBean;


public interface ElasticProductsRepository extends ElasticsearchRepository<Product, Long>, ElasticsearchRepositoryCustom {
}
