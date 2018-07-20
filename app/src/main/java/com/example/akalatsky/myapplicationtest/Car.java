package com.example.akalatsky.myapplicationtest;

import javax.inject.Inject;

public class Car {

    private String car = "mersedes";
    @Inject
    public Car() {
    }

    public String getCar() {
        return car;
    }
}
