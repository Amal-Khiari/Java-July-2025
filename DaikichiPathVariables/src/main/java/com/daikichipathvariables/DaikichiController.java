package com.daikichipathvariables;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {

    // 🔸 Route statique : today
    @RequestMapping("/today")
    public String today() {
        return "Today you will find luck in all your endeavors!";
    }

    // 🔹 Route statique : tomorrow
    @RequestMapping("/tomorrow")
    public String tomorrow() {
        return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
    }

    // 🏙️ Route dynamique : travel
    @RequestMapping("/travel/{city}")
    public String travel(@PathVariable String city) {
        return "Congratulations! You will soon travel to " + city + "!";
    }

    // 🎲 Route dynamique : lotto
    @RequestMapping("/lotto/{number}")
    public String lotto(@PathVariable int number) {
        if (number % 2 == 0) {
            return "You will take a grand journey in the near future, but be weary of tempting offers.";
        } else {
            return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
        }
    }
}


