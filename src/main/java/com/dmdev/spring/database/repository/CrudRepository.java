package com.dmdev.spring.database.repository;

import java.util.Optional;

public interface CrudRepository<К,E> {
    Optional<E> findById(К id);
    void delete(E entity);
}
