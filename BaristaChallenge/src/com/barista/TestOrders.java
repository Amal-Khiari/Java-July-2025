package com.barista;

public class TestOrders {
    public static void main(String[] args) {
        // Create items
        Item coffee = new Item("Drip Coffee", 1.50);
        Item cappuccino = new Item("Cappuccino", 3.50);
        Item latte = new Item("Latte", 4.00);
        Item mocha = new Item("Mocha", 3.75);

        // Create 2 guest orders
        Order order1 = new Order();
        Order order2 = new Order();

        // Create 3 named orders
        Order order3 = new Order("Cindhuri");
        Order order4 = new Order("Sam");
        Order order5 = new Order("Jimmy");

        // Add items
        order1.addItem(coffee);
        order1.addItem(cappuccino);

        order2.addItem(latte);
        order2.addItem(mocha);

        order3.addItem(coffee);
        order3.addItem(mocha);

        order4.addItem(latte);
        order4.addItem(cappuccino);

        order5.addItem(coffee);
        order5.addItem(latte);

        // Set some orders to ready
        order1.setReady(true);
        order3.setReady(true);

        // Test status messages
        System.out.println(order1.getStatusMessage());
        System.out.println(order2.getStatusMessage());

        // Test totals
        System.out.println("Order 1 Total: $" + order1.getOrderTotal());

        // Display all orders
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
    }
}
