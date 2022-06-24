package com.example.liskov.model;

public class LionCarnivore extends  Carnivore {

        @Override
        public void huntTarget() {
            System.out.println("Lion hunting the target!");
        }

        @Override
        public String getName() {
            return "LionCarnivore";
        }
    }

