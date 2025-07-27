package com.zookeeper;

public class Gorilla extends Mammal {

    public Gorilla() {
        super(); // starts with energy 100
    }

    public void throwSomething() {
        this.energy -= 5;
        System.out.println("The gorilla has thrown something. Energy -5.");
    }

    public void eatBananas() {
        this.energy += 10;
        System.out.println("The gorilla is satisfied after eating bananas. Energy +10.");
    }

    public void climb() {
        this.energy -= 10;
        System.out.println("The gorilla has climbed a tree. Energy -10.");
    }
}

