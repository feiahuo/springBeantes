package com.test;

import org.springframework.stereotype.Component;


public class Car2 {
    private Vehicle vehicle;
    private String name;
    private int year;

    public void drive() {
        System.out.println("this is Car2 drive");
    }

    public Car2() {
    }

    public Car2(Vehicle vehicle, String name, int year) {
        this.vehicle = vehicle;
        this.name = name;
        this.year = year;
    }

    public Car2(String name, int year) {
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

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
