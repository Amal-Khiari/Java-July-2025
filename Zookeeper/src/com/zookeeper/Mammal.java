package com.zookeeper;

public class Mammal {
    protected int energy;

    public Mammal() {
        this.energy = 100;
    }

    public Mammal(int energy) {
        this.energy = energy;
    }

    public int displayEnergy() {
        System.out.println("Energy level: " + this.energy);
        return this.energy;
    }
}

