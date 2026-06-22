package com.example.inventory;
import com.example.model.Product;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<Integer,Product>products;
    public Inventory(){
        products = new HashMap<>();
    }
    public void addProduct(Product product){
        products.put(product.getId(), product);
    }
    public Product getProduct(int productId){
        return products.get(productId);
    }

    public void displayProducts() {
        for (Product product : products.values()) {
            System.out.println(product);
        }
    }


}
