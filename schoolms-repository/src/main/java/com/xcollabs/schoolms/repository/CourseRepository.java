package com.xcollabs.schoolms.repository;

import com.xcollabs.schoolms.entities.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepository implements com.xcollabs.schoolms.repository.interfaces.CourseRepository{
    private List<Course> courses;

    public CourseRepository(){
        this.courses = new ArrayList<Course>();
        this.courses.add(new Course(1, "Bangla", "101", "Bangla 1st Part"));
        this.courses.add(new Course(2, "Bangla", "102", "Bangla 2nd Part"));
        this.courses.add(new Course(3, "English", "103", "English 1st Part"));
    }

    @Override
    public List<Course> getAll(){
        return this.courses;
    }

    @Override
    public Course getById(int id){
        for(Course course: this.courses)
            if(course.getId() == id)
                return course;
        return null;
    }

    @Override
    public void add(Course course){
        this.courses.add(course);
    }

    @Override
    public void update(Course course) {
        for(Course c: this.courses){
            if(c.getId() == course.getId()){
                c.setName(course.getName());
                c.setCode(course.getCode());
                c.setDescription(course.getDescription());
                return;
            }
        }
    }

    @Override
    public void delete(int id){
        for(Course course: this.courses)
            if(course.getId() == id)
                this.courses.remove(course);
        return;
    }
}
