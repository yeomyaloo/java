package com.example.springbootelasticsearch.documents;


import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Document(indexName = "products")
public class Product {

    @Id
    @Field(name = "id", type = FieldType.Long)
    private Long id;
    
    @Field(name = "name", type = FieldType.Text)
    private String name;
}
