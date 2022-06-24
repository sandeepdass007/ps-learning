package com.example.liskov.model;

public abstract class AnimalLiskov {

    public void run(){
        System.out.println("Running");
    }

    public void sleep(){
        System.out.println("Sleeping");
    }

    public abstract String getName();

}
