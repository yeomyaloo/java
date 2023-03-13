package com.example.springbootelasticsearch.service;


import com.example.springbootelasticsearch.documents.Product;
import com.example.springbootelasticsearch.repository.ElasticProductsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ElasticProductServiceImpl implements ElasticProductService{

    private final ElasticProductsRepository repository;

    @Override
    public Product save(Product product) {
        return repository.save(product);
    }

    @Override
    public Product findById(Long id) {
        return repository.findById(id).orElseThrow(RuntimeException::new);
    }
}
