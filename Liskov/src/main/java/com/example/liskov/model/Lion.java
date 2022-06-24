package com.example.liskov.model;

public class Lion extends Animal{

    @Override
    public void huntTarget() {
        System.out.println("Lion hunting the target");
    }
}
