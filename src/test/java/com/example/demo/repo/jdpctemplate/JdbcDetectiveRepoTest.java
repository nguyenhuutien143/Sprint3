package com.example.demo.repo.jdpctemplate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class JdbcDetectiveRepoTest {
    @Autowired
    private JdbcDetectiveRepo jdbcDetectiveRepo;

    @Test
    void findByBadgeNumber() {
    }
}