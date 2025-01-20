package com.penan.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.penan.demo.entity.Person;
import com.penan.demo.repository.PersonRepository;

@Service
public class PersonService {
    
    @Autowired
    private PersonRepository personRepository;

    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    public Person getPersonByName(String name) {
        return personRepository.findByName(name);
    }

}
