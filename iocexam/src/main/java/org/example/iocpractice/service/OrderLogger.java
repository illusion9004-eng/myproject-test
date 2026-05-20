package org.example.iocpractice.service;

import org.springframework.stereotype.Component;

@Component
public class OrderLogger {
    public void log() {
        System.out.println("주문을 시작합니다.");
    }
}