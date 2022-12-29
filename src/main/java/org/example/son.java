package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class son implements grandfather {

    @Override
    public void asset1() {
        System.out.println("increasing assest");
    }

    @Override
    public void asset2() {
        System.out.println("assest2 increasing");
    }
}
