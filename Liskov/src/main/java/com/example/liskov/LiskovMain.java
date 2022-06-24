package com.example.liskov;

import com.example.liskov.model.*;

public class LiskovMain {

    public static void main(String [] args){

       /* Lion lion = new Lion();
        performAction(lion);
        Goat goat = new Goat();
        performAction(goat);*/

        LionCarnivore  lionCarnivore = new LionCarnivore();
        performActions(lionCarnivore);
        GoatHerbivore goatHerbivore = new GoatHerbivore();
        performActions(goatHerbivore);


    }

    public  static void performAction(Animal animal){
        animal.walk();
        animal.sleep();
        animal.huntTarget();
        animal.run();

    }

    public  static void performActions(AnimalLiskov animal){

        final String animalName = animal.getName();
        System.out.println("Processing actions for " + animalName);

        animal.run();
        animal.sleep();



    }
}
