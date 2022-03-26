package com.example.webpos.db;

import com.example.webpos.model.Cart;
import com.example.webpos.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PosInMemoryDB implements PosDB {
    private List<Product> products = new ArrayList<>();

    private Cart cart;

    @Override
    public List<Product> getProducts() {
        return products;
    }

    @Override
    public Cart saveCart(Cart cart) {
        this.cart = cart;
        return this.cart;
    }

    @Override
    public Cart getCart() {
        return this.cart;
    }

    @Override
    public Product getProduct(String productId) {
        for (Product p : getProducts()) {
            if (p.getId().equals(productId)) {
                return p;
            }
        }
        return null;
    }

    private PosInMemoryDB() {
        this.products.add(new Product("PD1", "in-the-blue-room", 49999, "anna-ancher-sunlight-in-the-blue-room-google-art-project.jpg"));
        this.products.add(new Product("PD2", "david", 19999, "david-1914.jpg"));
        this.products.add(new Product("PD3", "david-in-profile", 19999, "david-in-profile-1914.jpg"));
        this.products.add(new Product("PD4", "peasant-life", 29999, "peasant-life-the-stable-night-man-with-whip-1917.jpg"));
        this.products.add(new Product("PD5", "a-summer-s-day", 10000, "a-summer-s-day-at-skagen-south-beach-1884.jpg"));

    }

}
