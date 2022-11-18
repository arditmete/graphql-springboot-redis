package com.graphql.demo.resolver;

import com.graphql.demo.model.Product;
import com.graphql.demo.service.ProductService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

    private ProductService productService;

    public Mutation(ProductService productService){
        this.productService = productService;
    }

    public Product newProduct(String name, String quantity, String type){
       return productService.addProduct(name, quantity, type);
    }

}
