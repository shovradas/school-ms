package com.xcollabs.schoolms.service.impl;

import com.xcollabs.schoolms.entities.Course;
import com.xcollabs.schoolms.data.CourseRepository;
import com.xcollabs.schoolms.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl extends ServiceBase<Course> implements CourseService {
    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository){
        super(courseRepository);
        this.courseRepository = courseRepository;
    }

//    @Override
//    public List<Course> getAll() {
//        return courseRepository.getAll();
//    }
//
//    @Override
//    public <T> Optional<Course> getById(T id) {
//        return courseRepository.getById((int)id);
//    }

    @Override
    public Optional<Course> getByCode(String code) {
        Course course = null;
        for (Course c: courseRepository.getAll()){
            if(c.getCode().equals(code)) {
                course = c;
                break;
            }
        }
        return Optional.ofNullable(course);
    }

//    @Override
//    public Course add(Course course) throws Exception{
//        return courseRepository.add(course);
//    }
//
//    @Override
//    public Course update(Course course) throws Exception{
//        return courseRepository.update(course);
//    }
//
//    @Override
//    public <T> void delete(T id) throws Exception{
//        courseRepository.delete((int)id);
//    }
}
