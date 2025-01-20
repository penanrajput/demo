package com.penan.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.penan.demo.entity.Person;
import com.penan.demo.service.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonController {
    
    @Autowired
    private PersonService personService;

    @PostMapping
    public Person addPerson(@RequestBody Person person) {
        return personService.savePerson(person);
    }

    @GetMapping("/{name}")
    public Person getPersonByName(@PathVariable String name) {
        return personService.getPersonByName(name);
    }


}
