package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
        // life cycle using xml
//        Samosa s2 = (Samosa) context.getBean("sm1");
//        System.out.println(s2);
////        registering shutdown hook
       context.registerShutdownHook();
        
//        System.out.println("+++++++++++++++++++++++");
//        // life cycle using interface
//        
//        Pepsi p1=(Pepsi)context.getBean("p1");
//        System.out.println(p1);
        
       Anno_tation a1= (Anno_tation)context.getBean("a1");
       System.out.println(a1);
        
    }
}
