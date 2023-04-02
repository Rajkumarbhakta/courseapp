package com.rkbapps.courseapp.services;

import java.util.List;

import com.rkbapps.courseapp.Dto.CourseDto;
import com.rkbapps.courseapp.entities.Courses;

public interface CourseServices {
    
    public List<Courses> getCourses();

    public CourseDto getCourse(long id);

    public CourseDto addCourse(Courses courses);

    public String removeCourse(long id);

    public CourseDto updateCourse(CourseDto courses);

}
