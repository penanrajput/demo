package com.penan.demo.entity;



import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

import lombok.Getter;
import lombok.Setter;
@Node
@Getter
@Setter
public class Person {
    @Id
    // @GeneratedValue
    // private Long id;

    private Long personId;

    @Property
    private String name;

    @Property
    private int age;

    // Constructors, getters, setters
    public Person() {}

    public Person(Long personId, String name, int age) {
        this.personId = personId;
        this.name = name;
        this.age = age;
    }

    // Getters and setters
}