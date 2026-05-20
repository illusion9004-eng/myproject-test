package org.example.iocpractice.service;

import org.example.iocpractice.cook.Cook;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final Cook cook;

    private final OrderLogger orderLogger;


    public OrderService(Cook cook, OrderLogger orderLogger) {
        this.cook = cook;
        this.orderLogger = orderLogger;
    }

    public void order() {
        orderLogger.log();
        cook.cook();
    }
}