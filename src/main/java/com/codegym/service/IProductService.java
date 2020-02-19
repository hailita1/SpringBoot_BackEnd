package com.codegym.service;

import com.codegym.model.Product;

public interface IProductService {
    public Iterable<Product> findAll();

    public Product addProduct(Product product);
}
