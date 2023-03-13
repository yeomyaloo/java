package com.example.springbootelasticsearch.configuration;


import com.example.springbootelasticsearch.repository.ElasticProductsRepository;
import com.example.springbootelasticsearch.repository.ElasticsearchRepositoryCustom;
import com.example.springbootelasticsearch.repository.ElasticsearchRepositoryImpl;
import com.example.springbootelasticsearch.service.ElasticProductService;
import com.example.springbootelasticsearch.service.ElasticProductServiceImpl;
import org.apache.http.HttpHost;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;


@Configuration
@EnableElasticsearchRepositories(basePackages = "com.example.springbootelasticsearch.repository")
public class ElasticConfiguration extends ElasticsearchConfiguration {

    @Value("elasticsearch.url")
    private String elasticUrl;

    @Override
    @Bean
    public ClientConfiguration clientConfiguration() {
        return ClientConfiguration.builder()
                .connectedTo(elasticUrl)
                .build();
    }


}
