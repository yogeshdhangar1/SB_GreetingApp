package com.example_bridgelab.greet_app.service;
import com.example_bridgelab.greet_app.model.Greeting;
import com.example_bridgelab.greet_app.model.User;
import org.springframework.stereotype.Service;
public interface IGreetingService {
    Greeting addGreeting(User user);
}
