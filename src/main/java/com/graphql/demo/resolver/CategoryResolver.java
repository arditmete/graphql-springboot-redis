package com.graphql.demo.resolver;

import com.graphql.demo.exception.CategoryNotFoundException;
import com.graphql.demo.exception.ProductNotFoundException;
import com.graphql.demo.model.Category;
import com.graphql.demo.model.Product;
import com.graphql.demo.service.CategoryService;
import com.graphql.demo.service.ProductService;
import graphql.kickstart.tools.GraphQLResolver;

public class CategoryResolver implements GraphQLResolver<Category> {

    private CategoryService categoryService;

    public CategoryResolver(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    public Category getCategory(String id){
        return categoryService.findById(id).orElseThrow(()->new CategoryNotFoundException("Category with id " + id + " not found"));
    }
}
