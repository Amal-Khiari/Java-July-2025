package com.devices;

public class Phone extends Device {

    public void makeCall() {
        battery -= 5;
        System.out.println("You make a call.");
        checkBattery();
    }

    public void playGame() {
        if (battery < 25) {
            System.out.println("Battery too low to play a game.");
        } else {
            battery -= 20;
            System.out.println("You play a game.");
            checkBattery();
        }
    }

    public void charge() {
        battery += 50;
        System.out.println("You charge the phone.");
        checkBattery();
    }

    private void checkBattery() {
        System.out.println("Battery remaining: " + battery);
        if (battery < 10) {
            System.out.println("⚠️ Battery critical!");
        }
    }
}

