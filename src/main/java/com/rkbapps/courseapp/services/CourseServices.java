package com.rkbapps.courseapp.services;

import java.util.List;

import com.rkbapps.courseapp.model.Courses;

public interface CourseServices {
    
    public List<Courses> getCourses();

    public Courses getCourse(long id);

    public Courses addCourse(Courses courses);

    public String removeCourse(long id);

    

}
