package org.example.iocpractice.cook;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class ChineseCook implements Cook {
    @Override
    public void cook() {
        System.out.println("짜장면을 만듭니다.");
    }
}