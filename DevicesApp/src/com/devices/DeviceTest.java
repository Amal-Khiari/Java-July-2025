package com.devices;

public class DeviceTest {
    public static void main(String[] args) {
        Phone myPhone = new Phone();

        // 3 appels
        myPhone.makeCall();
        myPhone.makeCall();
        myPhone.makeCall();

        // 2 jeux
        myPhone.playGame();
        myPhone.playGame();

        // 1 recharge
        myPhone.charge();
    }
}
