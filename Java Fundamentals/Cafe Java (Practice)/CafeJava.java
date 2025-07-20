public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables
        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.0;
        double lattePrice = 4.5;
        double cappuccinoPrice = 3.8;

        // Customer name variables
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order status flags
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;    // Sam
        boolean isReadyOrder3 = false;   // Jimmy
        boolean isReadyOrder4 = true;    // Noah

        // Cindhuri ordered a coffee
        System.out.println(generalGreeting + customer1);
        if (isReadyOrder1) {
            System.out.println(customer1 + readyMessage);
        } else {
            System.out.println(customer1 + pendingMessage);
        }

        // Noah ordered a cappuccino
        System.out.println(generalGreeting + customer4);
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice);
        } else {
            System.out.println(customer4 + pendingMessage);
        }

        // Sam ordered 2 lattes
        System.out.println(generalGreeting + customer2);
        System.out.println(displayTotalMessage + (lattePrice * 2));
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
        } else {
            System.out.println(customer2 + pendingMessage);
        }

        // Jimmy was charged for coffee but ordered a latte
        double overcharge = lattePrice - dripCoffeePrice;
        System.out.println(generalGreeting + customer3);
        System.out.println("Oops! " + displayTotalMessage + overcharge);
    }
}