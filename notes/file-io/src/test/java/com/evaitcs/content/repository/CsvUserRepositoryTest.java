package com.evaitcs.content.repository;

import com.evaitcs.content.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CsvUserRepositoryTest {

    private CsvUserRepository repository = new CsvUserRepository();


    @Test
    void findAll() {
        List<User> all = repository.findAll();
        assertEquals(all.size(), 6);

        System.out.println(all);
    }

    @Test
    void findByName() {
    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }
}