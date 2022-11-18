package com.graphql.demo.resolver;

import com.graphql.demo.exception.ProductNotFoundException;
import com.graphql.demo.model.Product;
import com.graphql.demo.service.ProductService;
import graphql.kickstart.tools.GraphQLResolver;

public class ProductResolver implements GraphQLResolver<Product> {

    private ProductService productService;

    public ProductResolver(ProductService productService){
        this.productService = productService;
    }

    public Product getProduct(String id){
        return productService.findById(id).orElseThrow(()->new ProductNotFoundException("Product with id " + id + " not found"));
    }
}
