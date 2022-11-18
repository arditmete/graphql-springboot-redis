package com.graphql.demo.resolver;

import com.graphql.demo.model.Product;
import com.graphql.demo.service.ProductService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    private ProductService productService;

    public Query(ProductService productService)
    {
        this.productService = productService;
    }

    public Iterable<Product> getAllProducts(){
        return productService.findAll();
    }
    public Product getProduct(String id){
        return productService.findById(id).orElseThrow(null);
    }

}
