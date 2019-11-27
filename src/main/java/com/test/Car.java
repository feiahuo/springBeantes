package com.test;

public class Car implements Vehicle {
    private String name;
    private int year;

    public Car() {

    }

    public void drive() {
        System.out.println("小明开着刚买的豪车去环球旅行");
    }

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
