package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class family {

    @Value("123")
    private int num;
    @Value("thrive")
    private String name;
    @Autowired
    private father fam;

    public void show()
    {
        System.out.println("num"+num+"name"+name);
        fam.asset1();
        fam.asset2();
    }

}
