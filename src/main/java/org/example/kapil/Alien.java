package org.example.kapil;

/**
 * @author Kapil Kaushik
 * @project Spring-exampe
 * @Date 20/01/23
 * @Time 4:26 pm
 */

public class Alien {
    private int age ;
    private Laptop laptop;

    public Alien() {
        System.out.println("alien constructor called");
    }

    public void can(){
        laptop.code();
    }

    public Alien(int age) {
        System.out.println("agrs constructor called age");
        this.age = age;
    }
    public Alien(int age, Laptop laptop) {
        System.out.println("agrs constructor called age laptop");
        this.laptop = laptop;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
