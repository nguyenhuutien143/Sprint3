package com.example.demo.repo.jpa;


import com.example.demo.model.AbstractEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AbstractRepo <T extends AbstractEntity> {
    void save(T entity);
    void delete(T entity);
    T update(T entity);
    int deleteById(Long entityId);
    Optional<T> findById(Long entityId);
}
