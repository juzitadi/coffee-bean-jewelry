
package com.yourcompany.coffeebeanjewelry.controller;

import com.yourcompany.coffeebeanjewelry.model.Product;
import com.yourcompany.coffeebeanjewelry.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    // Other CRUD operations
}
                                        