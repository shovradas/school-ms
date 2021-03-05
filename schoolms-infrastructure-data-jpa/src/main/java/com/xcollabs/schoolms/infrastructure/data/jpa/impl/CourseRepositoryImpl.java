package com.xcollabs.schoolms.infrastructure.data.jpa.impl;

import com.xcollabs.schoolms.data.CourseRepository;
import com.xcollabs.schoolms.entities.Course;
import com.xcollabs.schoolms.infrastructure.data.jpa.CourseRepositoryJpa;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class CourseRepositoryImpl implements CourseRepository {
    private final CourseRepositoryJpa courseRepositoryJpa;

    public CourseRepositoryImpl(CourseRepositoryJpa courseRepositoryJpa){
        this.courseRepositoryJpa = courseRepositoryJpa;
    }

    @Override
    public List<Course> getAll(){
        List<Course> courses = new ArrayList<>();
        this.courseRepositoryJpa.findAll().forEach(courses::add);
        return courses;
    }

    @Override
    public <T> Optional<Course> getById(T id){
        return this.courseRepositoryJpa.findById((int)id);
    }

    @Override
    public Course add(Course course) throws Exception{
        return this.courseRepositoryJpa.save(course);
    }

    @Override
    public Course update(Course course) throws Exception {
        //TODO: Reconsider implementation
        return this.courseRepositoryJpa.save(course);
    }

    @Override
    public <T> void delete(T id) throws Exception{
        Optional<Course> course = this.courseRepositoryJpa.findById((int)id);
        if(course.isPresent())
            this.courseRepositoryJpa.delete(course.get());
    }
}