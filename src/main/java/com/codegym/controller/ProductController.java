package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/api/product")
    public ResponseEntity<Iterable<Product>> findAll() {
        Iterable<Product> categories = this.productService.findAll();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @PostMapping("/api/product")
    public ResponseEntity<Product> addProduct(@RequestBody Product products) {
        Product product = this.productService.addProduct(products);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

}
