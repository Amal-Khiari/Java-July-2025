import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {

        CafeUtil appTest = new CafeUtil();

        // Tester l'objectif de fidélité
        System.out.println("\n----- Test Fidélité -----");
        System.out.printf("Achats nécessaires à la semaine 10 : %s \n\n", appTest.getStreakGoal());

        // Tester le total de commande
        System.out.println("----- Test Total Commande -----");
        double[] articles = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Total de commande : %s \n\n", appTest.getOrderTotal(articles));

        // Tester l'affichage du menu
        System.out.println("----- Test Affichage Menu -----");
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("café filtre");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        appTest.displayMenu(menu);

        // Tester l'ajout de client
        System.out.println("\n----- Test Ajouter Client -----");
        ArrayList<String> clients = new ArrayList<String>();
        for (int i = 0; i < 4; i++) {
            appTest.addCustomer(clients);
            System.out.println("\n");
        }
    }
}