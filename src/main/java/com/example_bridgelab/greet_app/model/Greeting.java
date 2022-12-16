package com.example_bridgelab.greet_app.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
    @Table(name = "Greeting")
    @Getter
@AllArgsConstructor
    public class Greeting {

        @Id
        @Column(name="id",nullable = false)
        private final long id;

        private final String message;

        public Greeting(){
            id=0;
            message=" Hello Yogesh";
        }
}
