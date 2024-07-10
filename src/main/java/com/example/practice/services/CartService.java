package com.example.practice.services;


import com.example.practice.models.Cart;
import com.example.practice.repositories.CartRepo;
import org.springframework.stereotype.Service;

@Service
public class CartService {


    private final CartRepo cartRepo;

    public CartService(CartRepo cartRepo) {
        this.cartRepo = cartRepo;
    }

    public void create(Cart cart){
        cartRepo.save(cart);
    }
}
