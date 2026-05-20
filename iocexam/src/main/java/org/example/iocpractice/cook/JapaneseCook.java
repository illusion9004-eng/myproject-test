package org.example.iocpractice.cook;

import org.springframework.stereotype.Component;

@Component
public class JapaneseCook implements Cook {
    @Override
    public void cook() {
        System.out.println("초밥을 만듭니다.");
    }
}