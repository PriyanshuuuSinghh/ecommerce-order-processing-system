package com.example.service;

import com.example.inventory.Inventory;
import com.example.model.Order;
import com.example.model.Product;

public class OrderProcessor {

    private Inventory inventory;

    public OrderProcessor(Inventory inventory) {
        this.inventory = inventory;
    }

    public void processOrder(Order order) {

        Product product = inventory.getProduct(order.getProductId());

        if (product == null) {
            order.setStatus("FAILED");
            System.out.println("Product not found.");
            return;
        }

        if (product.getStock() >= order.getQuantity()) {

            product.setStock(
                    product.getStock() - order.getQuantity()
            );

            order.setStatus("SUCCESS");

            System.out.println(
                    "Order " + order.getOrderId() +
                            " processed successfully."
            );

        } else {

            order.setStatus("FAILED");

            System.out.println(
                    "Order " + order.getOrderId() +
                            " failed due to insufficient stock."
            );
        }
    }
}