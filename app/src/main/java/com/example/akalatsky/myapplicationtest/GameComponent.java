package com.example.akalatsky.myapplicationtest;

import dagger.Component;

@Component(modules  = TestModul.class)
public interface GameComponent {
    void inject(TestCL obj);
}
