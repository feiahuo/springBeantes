package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanTest2 {
    @Bean(initMethod ="init",destroyMethod = "destory")
    public Bicycle bicycle(){
        return new Bicycle();
    }

}
