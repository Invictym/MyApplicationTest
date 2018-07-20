package com.example.akalatsky.myapplicationtest;

import dagger.Component;

@Component(modules = TestClModule.class)
public interface GameComponent {
    TestCL inject();
}
