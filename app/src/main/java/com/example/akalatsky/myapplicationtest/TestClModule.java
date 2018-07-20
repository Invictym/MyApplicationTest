package com.example.akalatsky.myapplicationtest;

import dagger.Module;
import dagger.Provides;

@Module
public class TestClModule {
    @Provides
    TestCL provideTestCL(Car car) {
        TestCL testCL = new TestCL(car);
        testCL.name2 = "aa";
        return testCL;
    }
}
