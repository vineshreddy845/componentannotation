package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {

    public static void main(String args[])
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(configuration.class);
       family fam1= context.getBean(family.class);
       fam1.show();
    }
}
