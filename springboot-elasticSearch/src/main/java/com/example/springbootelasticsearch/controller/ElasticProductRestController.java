package com.example.springbootelasticsearch.controller;


import com.example.springbootelasticsearch.documents.Product;
import com.example.springbootelasticsearch.service.ElasticProductService;
import com.example.springbootelasticsearch.service.ElasticProductServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/search")
public class ElasticProductRestController {

    private final ElasticProductService service;

    @PostMapping("/save")
    public Product save(@RequestBody Product product){
        return service.save(product);
    }

    @GetMapping("/{id}")
    public Product findById(@RequestParam Long id){
        return service.findById(id);
    }
}
