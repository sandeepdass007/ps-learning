package com.example.liskov.model;

public class Goat extends Animal{
    @Override
    public void huntTarget() {
        throw  new RuntimeException("I dont hunt");
    }
}
