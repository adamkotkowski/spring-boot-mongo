package com.akotkowski.springbootmongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMongoTestApplication implements CommandLineRunner {

    @Autowired
    PeopleRepository peopleRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMongoTestApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        peopleRepository.deleteAll();
        peopleRepository.save(new Person("John", "Doe"));
        peopleRepository.save(new Person("Jaś", "Wędrowniczek"));
        peopleRepository.save(new Person("Sally", "O'connor"));
        peopleRepository.save(new Person("Phil", "Morris"));

    }
}
