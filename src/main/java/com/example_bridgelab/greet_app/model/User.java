package com.example_bridgelab.greet_app.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        String str = (firstName!= null)? firstName+" ": " ";
        str += (lastName != null) ? lastName:" ";
        return str.trim();
    }
}
