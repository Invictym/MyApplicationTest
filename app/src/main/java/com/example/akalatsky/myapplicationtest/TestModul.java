package com.example.akalatsky.myapplicationtest;

import dagger.Module;
import dagger.Provides;

@Module
public class TestModul {

    @Provides
    TestCL providesTestCL() {
        return new TestCL();
    }
}
