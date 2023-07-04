package com.codeclan.example.folders_and_files_homework.controller;

import com.codeclan.example.folders_and_files_homework.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.codeclan.example.folders_and_files_homework.repository.PersonRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {
    @Autowired
    PersonRepository personRepository;


    @GetMapping(value = "/people")
    public List<Person> getAllPeople(){
        return personRepository.findAll();
    }

    @GetMapping(value = "/people/{id}")
    public Optional<Person> getPerson(@PathVariable Long id){
        return personRepository.findById(id);
    }

    @PostMapping(value = "/people")
    public ResponseEntity<Person> postPerson(@RequestBody Person person) {
        personRepository.save(person);
        return new ResponseEntity<>(person, HttpStatus.CREATED);
    }

}

