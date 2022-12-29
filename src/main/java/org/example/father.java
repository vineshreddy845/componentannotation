package org.example;

import org.springframework.stereotype.Component;

@Component
public class father implements grandfather {

    @Override
    public void asset1() {
        System.out.println("increasing assest");
    }

    @Override
    public void asset2() {
        System.out.println("assest2 also increasing");
    }
}
