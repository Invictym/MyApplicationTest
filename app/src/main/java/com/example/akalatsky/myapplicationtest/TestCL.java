package com.example.akalatsky.myapplicationtest;

import javax.inject.Inject;

public class TestCL {

    public String name= "Alalalala";
    public String name2;
    public String year;

    @Inject
    public TestCL(Car car) {
        year = car.getCar();
    }
}
