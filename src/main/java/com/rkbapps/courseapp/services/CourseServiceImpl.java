package com.rkbapps.courseapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rkbapps.courseapp.model.Courses;

@Service
public class CourseServiceImpl implements CourseServices {

    private List<Courses> cList;

    public CourseServiceImpl() {
        cList = new ArrayList<>();
        cList.add(new Courses(12, "C++ Course", "Full C++ Course", 3.5));
        cList.add(new Courses(112, "Core Java Course", "This is the ultimate java course for Java newby", 4.2));
    }

    @Override
    public List<Courses> getCourses() {
        return cList;
    }

    @Override
    public Courses getCourse(long id) {

        for (Courses course : cList) {

            if (course.getId() == id) {
                return course;
            }

        }

        return null;

    }

    @Override
    public Courses addCourse(Courses courses) {
        cList.add(courses);
        return courses;
    }

    @Override
    public String removeCourse(long id) {
        
        for(Courses c:cList){

            if(c.getId()==id)
            {
                cList.remove(c);
                return "Success";
            }

        }
        return "Failed";


    }

}
