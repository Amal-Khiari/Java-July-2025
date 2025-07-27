package com.coffeedore.kiosk;

public class Item {
    private String name;
    private double price;
    private int index;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Item(String name, double price, int index) {
        this.name = name;
        this.price = price;
        this.index = index;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getIndex() { return index; }

    public void setIndex(int index) { this.index = index; }

    @Override
    public String toString() {
        return index + " " + name + " -- $" + String.format("%.2f", price);
    }
}

