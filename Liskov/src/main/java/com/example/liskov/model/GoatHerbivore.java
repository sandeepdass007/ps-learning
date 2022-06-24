package com.example.liskov.model;

public class GoatHerbivore  extends Herbivore {

    @Override
    public void eatGrass() {
        System.out.println("Eating grass...");
    }

    @Override
    public String getName() {
        return "GoatHerbivore";
    }

}
