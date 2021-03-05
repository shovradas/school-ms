package com.xcollabs.schoolms.api.controller;

import com.xcollabs.schoolms.entities.Course;
import com.xcollabs.schoolms.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService){
        this.courseService = courseService;
    }

    @GetMapping("/courses")
    public List<Course> getAllCourses(@RequestParam(required = false) String code){
        if (code!= null){
            List<Course> courses = new ArrayList<>();
            Optional<Course> course = courseService.getByCode(code);
            if(course.isPresent()){
                courses.add(course.get());
            }
            return courses;
        }
        return courseService.getAll();
    }

    @GetMapping("/courses/{id}")
    public Optional<Course> getCourse(@PathVariable int id){
        return courseService.getById(id);
    }

    @PostMapping("/courses")
    public void addCourse(@RequestBody Course course){
        try{
            courseService.add(course);
        } catch (Exception e){
            //TODO: Error Response
        }
    }

    @PutMapping("/courses")
    public void editCourse(@RequestBody Course course){
        try{
            courseService.update(course);
        } catch (Exception e){
            //TODO: Error Response
        }
    }

    @DeleteMapping("/courses/{id}")
    public void removeCourse(@PathVariable int id){
        try{
            courseService.delete(id);
        } catch (Exception e){
            //TODO: Error Response
        }
    }
}
