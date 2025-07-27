package com.coffeedore.kiosk;

import java.util.ArrayList;

public class Order {
    private String customerName;
    private ArrayList<Item> items;

    public Order(String name) {
        this.customerName = name;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void display() {
        System.out.println("\n📦 Order for: " + customerName);
        for (Item item : items) {
            System.out.println(" - " + item.toString());
        }
        System.out.println("🧾 Total: $" + String.format("%.2f", calculateTotal()));
    }

    private double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
}
