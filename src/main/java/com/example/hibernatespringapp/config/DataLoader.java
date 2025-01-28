package com.example.hibernatespringapp.config;

import com.example.hibernatespringapp.entity.Person;
import com.example.hibernatespringapp.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    public CommandLineRunner loadData(PersonRepository personRepository) {
        return args -> {
            personRepository.save(new Person("John Doe", 30, "Moscow"));
            personRepository.save(new Person("Jane Smith", 25, "New York"));
            personRepository.save(new Person("Alice Johnson", 35, "Moscow"));
        };
    }
}