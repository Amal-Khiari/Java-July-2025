import java.util.ArrayList;

public class CafeUtil {

    // Méthode 1 : Objectif de fidélité sur 10 semaines
    public int getStreakGoal() {
        int somme = 0;
        for (int i = 1; i <= 10; i++) {
            somme += i;
        }
        return somme;
    }

    // Variante bonus avec un paramètre
    public int getStreakGoal(int nbSemaines) {
        int somme = 0;
        for (int i = 1; i <= nbSemaines; i++) {
            somme += i;
        }
        return somme;
    }

    // Méthode 2 : Total de la commande
    public double getOrderTotal(double[] prix) {
        double total = 0;
        for (double p : prix) {
            total += p;
        }
        return total;
    }

    // Méthode 3 : Afficher le menu
    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    // Méthode 4 : Ajouter un client
    public void addCustomer(ArrayList<String> clients) {
        System.out.println("Veuillez entrer votre nom :");
        String nom = System.console().readLine();  // Peut ne pas marcher dans certains IDE, Scanner est une alternative
        System.out.println("Bonjour " + nom + " !");
        System.out.println("Il y a " + clients.size() + " personnes devant vous.");
        clients.add(nom);
        System.out.println(clients);
    }
}