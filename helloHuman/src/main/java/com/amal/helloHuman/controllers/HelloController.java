package com.amal.helloHuman.controllers;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // ✅ Route simple "/"
    @RequestMapping("/")
    public String hello() {
        return "Hello Human";
    }

    // ✅ Route avec "?name=Amal"
    @RequestMapping("/hello")
    public String helloName(@RequestParam(value="name", required=false) String name) {
        if (name == null || name.isEmpty()) {
            return "Hello Human";
        }
        return "Hello " + name;
    }

    // ✅ Route avec prénom + nom de famille
    @RequestMapping("/helloFull")
    public String helloFullName(
        @RequestParam(value="name", required=false) String firstName,
        @RequestParam(value="last_name", required=false) String lastName
    ) {
        if ((firstName == null || firstName.isEmpty()) &&
            (lastName == null || lastName.isEmpty())) {
            return "Hello Human";
        }
        return "Hello " + 
               (firstName != null ? firstName : "") + " " +
               (lastName != null ? lastName : "");
    }

    // ✅ Route avec répétition du message
    @RequestMapping("/repeat")
    public String repeatMessage(
        @RequestParam(value="name", required=false) String name,
        @RequestParam(value="times", required=false) Integer times
    ) {
        if (name == null || name.isEmpty() || times == null || times < 1) {
            return "Hello Human";
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < times; i++) {
            result.append("Hello ").append(name).append("<br>");
        }
        return result.toString();
    }
}

