
package com.yourcompany.coffeebeanjewelry.service;

import com.yourcompany.coffeebeanjewelry.model.Product;
import com.yourcompany.coffeebeanjewelry.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    // Other CRUD methods
}
                                        