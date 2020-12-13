package com.baidu.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Value("黑妮")
    private String name;
    private int Age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return Age;
    }
    @Value("20")
    public void setAge(int age) {
        Age = age;
    }
}
