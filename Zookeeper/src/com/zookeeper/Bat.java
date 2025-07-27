package com.zookeeper;

public class Bat extends Mammal {

    public Bat() {
        super(300); // starts with energy 300
    }

    public void fly() {
        this.energy -= 50;
        System.out.println("The bat is airborne. Energy -50.");
    }

    public void eatHumans() {
        this.energy += 25;
        System.out.println("The bat feels satisfied after eating humans. Energy +25.");
    }

    public void attackTown() {
        this.energy -= 100;
        System.out.println("The bat is attacking a town! Energy -100.");
    }
}

