package com.test;

public class Bicycle implements Vehicle {
    private String name;

    public void drive() {
        System.out.println("老王骑着八十年代的自行车在镇上溜达");
    }

    public Bicycle() {
    }

    public Bicycle(String name) {
        this.name = name;
    }

    public void init(){
        System.out.println("Bicycle init .....");
    }
    public void destory(){
        System.out.println("Bicycle destory .....");
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
