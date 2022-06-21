package com.example.demo.service.impl;

import com.example.demo.service.PersonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PersonServiceImplTest {
    @Autowired
    private PersonService personService;

    @Test
    void findByUsername() {
    }

    @Test
    void findAllByUsernamePart() {
    }

    @Test
    void findByCompleteName() {
    }

    @Test
    void findAll() {
    }

    @Test
    void updatePassword() {
    }

    @Test
    void count() {
    assertEquals(0,personService.count());
    }

    @Test
    void createPerson() {
    }
}