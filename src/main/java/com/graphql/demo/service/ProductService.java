package com.graphql.demo.service;

import com.graphql.demo.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product addProduct(String name, String quantity, String type);
    List<Product> findAll();
    Optional<Product> findById(String id);
}
