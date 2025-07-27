package com.coffeedore.kiosk;

public class Main {
    public static void main(String[] args) {
        CoffeeKiosk kiosk = new CoffeeKiosk();

        // Ajout des éléments du menu
        kiosk.addMenuItem("banana", 2.00);
        kiosk.addMenuItem("coffee", 1.50);
        kiosk.addMenuItem("latte", 4.50);
        kiosk.addMenuItem("capuccino", 3.00);
        kiosk.addMenuItem("muffin", 4.00);

        // ASCII Art rétro ☕
        System.out.println("╔════════════════════════════╗");
        System.out.println("║   ☕ Welcome to Coffeedore 64 ☕   ║");
        System.out.println("╚════════════════════════════╝");

        // Interaction
        kiosk.newOrder();

        // Ninja Bonus (si tu veux tester)
        // kiosk.addMenuItemByInput();
        // kiosk.displayMenu();
    }
}


