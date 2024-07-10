package com.example.practice.models;

import com.example.practice.utility.Categories;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "Product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int product_id;
    @Column(unique = true)
    String name;
    int price;
    Categories category;

    String description;

    @ManyToMany(mappedBy = "products")
    private List<Cart> carts;
}
