package com.example_bridgelab.greet_app.controller;

import com.example_bridgelab.greet_app.model.Greeting;
import com.example_bridgelab.greet_app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example_bridgelab.greet_app.service.IGreetingService;
@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @Autowired
    private IGreetingService greetingService;
    @GetMapping(value = {"","/"})
    public Greeting greeting(@RequestParam String firstName, @RequestParam String lastName){
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return greetingService.addGreeting(user);
}
    }