import java.util.Date;

public class AlfredQuotes {

    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        return String.format("Hello, %s. Lovely to see you.", name);
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return String.format("It is currently %s.", date.toString());
    }

    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") >= 0) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.indexOf("Alfred") >= 0) {
            return "At your service. As you wish, naturally.";
        } else {
            return "Right. And with that I shall retire.";
        }
    }

    // Ninja Bonus: Overload guestGreeting method
    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
    }

    // Sensei Bonus: Dynamic dayPeriod based on current time
    public String guestGreeting() {
        Date date = new Date();
        int hour = date.getHours();
        String dayPeriod;

        if (hour < 12) {
            dayPeriod = "morning";
        } else if (hour < 18) {
            dayPeriod = "afternoon";
        } else {
            dayPeriod = "evening";
        }

        return String.format("Good %s. Lovely to see you.", dayPeriod);
    }

    // SENSEI Custom Method: Alfred in a mood
    public String angryResponse(String complaint) {
        return "ALFRED IS UNIMPRESSED: " + complaint.toUpperCase() + "?! Honestly, sir, that is quite beneath you.";
    }
}
