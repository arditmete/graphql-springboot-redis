package com.graphql.demo.resolver;

import com.graphql.demo.model.Product;
import com.graphql.demo.service.ProductService;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductResolver implements GraphQLResolver<Product> {

    @Autowired
    private ProductService productService;

    public ProductResolver(ProductService productService){
        this.productService = productService;
    }

    public Product getProduct(String id){
        return productService.findById(id).orElseThrow(null);
    }
}
