package com.xcollabs.schoolms.service;

import java.util.List;
import java.util.Optional;

public interface Service<E> {
    List<E> getAll();
    <T> Optional<E> getById(T id);
    E add(E entity) throws Exception;
    E update(E entity) throws Exception;
    <T> void delete(T id) throws Exception;
}
