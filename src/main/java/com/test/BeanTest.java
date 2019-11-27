package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {
    static ClassPathXmlApplicationContext cpxa=new ClassPathXmlApplicationContext("bean.xml");
    public static void main(String[] args) {
        demo3();
    }
    public static void demo1() {
        Car car = (Car) cpxa.getBean("CarIns");
        Bicycle bicycle = (Bicycle) cpxa.getBean("BicycleIns");
        car.drive();
        bicycle.drive();
    }

    public static void demo2(){
        Car2 car2 = (Car2) cpxa.getBean("Car2Ins");
        System.out.println(car2);
        car2.drive();
        System.out.println(car2.getName()+car2.getYear()+car2.getVehicle().toString());
    }
    public static void demo3(){
        AnnotationConfigApplicationContext aaaa = new AnnotationConfigApplicationContext(BeanTest2.class);
        Bicycle bicycle = aaaa.getBean(Bicycle.class);
        aaaa.close();
    }
}
