package com.rkbapps.courseapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rkbapps.courseapp.model.Courses;
import com.rkbapps.courseapp.services.CourseServices;

@RestController
public class MyController {
    
    @Autowired
    private CourseServices courseServices;

    @GetMapping("/home")
    public String homeController(){
        return "Welcome to Spring Home";
    }


    //* get all the courses */
    @GetMapping("/courses")
    public List<Courses> getAllCourses(){

        return courseServices.getCourses();

    }

    //*get a single course */
    @GetMapping("/courses/{courseId}")
    public Courses getCourse(@PathVariable long courseId){

        return courseServices.getCourse(courseId);
    }

    //* add a new course */
    @PostMapping("/courses")
    public Courses addNewCourse(@RequestBody Courses courses){
        return courseServices.addCourse(courses);
    }

    //*delete a course */
    @DeleteMapping("/courses/{courseId}")
    public String removeCourse(@PathVariable long courseId ){
        return courseServices.removeCourse(courseId);
    }



}
