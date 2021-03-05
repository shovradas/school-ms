package com.xcollabs.schoolms.service.impl;

import com.xcollabs.schoolms.data.CourseRepository;
import com.xcollabs.schoolms.data.Repository;
import com.xcollabs.schoolms.entities.Course;
import com.xcollabs.schoolms.service.Service;

import java.util.List;
import java.util.Optional;

public abstract class ServiceBase<E> implements Service<E> {
    private final Repository<E> repository;

    public ServiceBase(Repository<E> repository){
        this.repository = repository;
    }

    @Override
    public List<E> getAll() {
        return repository.getAll();
    }

    @Override
    public <T> Optional<E> getById(T id) {
        return repository.getById((int)id);
    }

    @Override
    public E add(E entity) throws Exception{
        return repository.add(entity);
    }

    @Override
    public E update(E entity) throws Exception{
        return repository.update(entity);
    }

    @Override
    public <T> void delete(T id) throws Exception{
        repository.delete((int)id);
    }
}
