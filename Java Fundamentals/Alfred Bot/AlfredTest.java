public class AlfredTest {
    public static void main(String[] args) {
        AlfredQuotes alfredBot = new AlfredQuotes();

        // Tests basiques
        System.out.println(alfredBot.basicGreeting());
        System.out.println(alfredBot.guestGreeting("Bruce", "evening")); // Ninja Bonus
        System.out.println(alfredBot.guestGreeting()); // Sensei Bonus
        System.out.println(alfredBot.angryResponse("someone moved my tea tray")); // Custom Method
    }
}