package com.example;

import com.example.inventory.Inventory;
import com.example.model.Order;
import com.example.model.Product;
import com.example.service.OrderProcessor;
import com.example.simulation.OrderTask;

public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Product laptop =
                new Product(101, "Laptop", 50000, 5);

        inventory.addProduct(laptop);

        OrderProcessor processor =
                new OrderProcessor(inventory);

        for (int i = 1; i <= 10; i++) {

            Order order =
                    new Order(i, i, 101, 1,"pending");

            Thread thread =
                    new Thread(
                            new OrderTask(order, processor)
                    );

            thread.start();
        }
    }
}