package com.xcollabs.schoolms.api.controller;

import com.xcollabs.schoolms.entities.Course;
import com.xcollabs.schoolms.service.interfaces.CourseService;
import org.springframework.web.bind.annotation.*;

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
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @GetMapping("/courses/{id}")
    public Optional<Course> getCourse(@PathVariable int id){
        return courseService.getCourse(id);
    }

    @PostMapping("/courses")
    public void addCourse(@RequestBody Course course){
        courseService.addCourse(course);
    }

    @PutMapping("/courses")
    public void editCourse(@RequestBody Course course){
        courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{id}")
    public void removeCourse(@PathVariable int id){
        courseService.deleteCourse(id);
    }
}
