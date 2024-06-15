package com.gg.SpringRestApi.service;

import com.gg.SpringRestApi.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Optional<Product> getProductById(Long id);

    List<Product> getAllProducts();

    Product addProduct(Product product);

    Product updateProduct(Product product);

    void deleteProduct(Long id);

}
