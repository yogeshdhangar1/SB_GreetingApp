package com.example_bridgelab.greet_app.respository;

import com.example_bridgelab.greet_app.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGreetingRepository extends JpaRepository<Greeting,Long> {

}
