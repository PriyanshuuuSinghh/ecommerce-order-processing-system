package com.example.simulation;

import com.example.model.Order;
import com.example.service.OrderProcessor;

public class OrderTask implements Runnable {

    private Order order;
    private OrderProcessor processor;

    public OrderTask(Order order, OrderProcessor processor) {
        this.order = order;
        this.processor = processor;
    }

    @Override
    public void run() {
        processor.processOrder(order);
    }
}