package com.rkbapps.courseapp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rkbapps.courseapp.entities.Courses;

public interface CourseServices {
    
    public List<Courses> getCourses();

    public Courses getCourse(long id);

    public Courses addCourse(Courses courses);

    public String removeCourse(long id);

    public Courses updateCourse(Courses courses);

}
