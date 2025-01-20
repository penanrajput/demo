package com.penan.demo.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.penan.demo.entity.Person;

public interface PersonRepository extends Neo4jRepository<Person, Long> {
    Person findByName(String name);
}
