package com.orders;

public class TestOrders {
    public static void main(String[] args) {

        // Création des items
        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 3.5;

        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 4.0;

        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 2.5;

        Item item4 = new Item();
        item4.name = "cappuccino";
        item4.price = 4.5;

        // Création des commandes
        Order order1 = new Order();
        order1.name = "Cindhuri";

        Order order2 = new Order();
        order2.name = "Jimmy";

        Order order3 = new Order();
        order3.name = "Noah";

        Order order4 = new Order();
        order4.name = "Sam";

        // Affichage initial
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %.2f\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        // Ajouts aux commandes
        order2.items.add(item1); // Jimmy commande un mocha
        order2.total += item1.price;

        order3.items.add(item4); // Noah commande un cappuccino
        order3.total += item4.price;

        order4.items.add(item2); // Sam commande un latte
        order4.total += item2.price;

        order1.ready = true; // Cindhuri est prête

        order4.items.add(item2); // Sam commande 2 autres lattes
        order4.items.add(item2);
        order4.total += item2.price * 2;

        order2.ready = true; // Jimmy est prêt

        // Affichage final
        System.out.println("\nCommandes mises à jour :");
        System.out.printf("Sam - Total: %.2f, Ready: %s\n", order4.total, order4.ready);
        System.out.printf("Jimmy - Total: %.2f, Ready: %s\n", order2.total, order2.ready);
    }
}
