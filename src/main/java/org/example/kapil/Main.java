package org.example.kapil;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien alien = (Alien) context.getBean("alien");
        System.out.println("age " +alien.getAge());
        alien.can();
    }
}