package com.gg.SpringRestApi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotBlank(message = "The product name is mandatory!")
    private String name;

    @NotBlank(message = "The product description is mandatory!")
    private String description;

    @NotNull(message = "The price of product is mandatory!")
    private Double price;

    @NotNull(message = "The amount is mandatory!")
    private Integer amount;

}
