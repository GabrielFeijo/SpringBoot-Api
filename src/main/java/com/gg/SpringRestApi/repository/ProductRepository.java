package com.gg.SpringRestApi.repository;

import com.gg.SpringRestApi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
