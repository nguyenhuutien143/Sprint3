package fresher.service.impl;

import fresher.service.PersonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

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

        assertEquals(2,personService.findAll().size());
    }

    @Test
    void updatePassword() {
    }

    @Test
    void count() {
    }

    @Test
    void createPerson() {
    }
}