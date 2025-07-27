package com.coffeedore.kiosk;

import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeeKiosk() {
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addMenuItem(String name, double price) {
        Item item = new Item(name, price, menu.size());
        menu.add(item);
    }

    public void displayMenu() {
        System.out.println("\n🧾 Menu:");
        for (Item item : menu) {
            System.out.println(" " + item.toString());
        }
    }

    public void newOrder() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("👤 Please enter customer name for new order:");
        String name = scanner.nextLine();

        Order order = new Order(name);
        displayMenu();

        System.out.println("👉 Enter item index or 'q' to quit:");
        String input = scanner.nextLine();

        while (!input.equals("q")) {
            try {
                int index = Integer.parseInt(input);
                if (index >= 0 && index < menu.size()) {
                    order.addItem(menu.get(index));
                } else {
                    System.out.println("❌ Invalid index.");
                }
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Please enter a number or 'q'.");
            }

            System.out.println("👉 Enter item index or 'q' to quit:");
            input = scanner.nextLine();
        }

        order.display();
        orders.add(order);
    }

    public void addMenuItemByInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🔐 Admin: Enter item name:");
        String name = scanner.nextLine();

        System.out.println("💲 Enter item price:");
        double price = Double.parseDouble(scanner.nextLine());

        addMenuItem(name, price);
        System.out.println("✅ Item added to menu!");
    }
}
