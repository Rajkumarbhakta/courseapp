package com.rkbapps.courseapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rkbapps.courseapp.dao.CourseDao;
import com.rkbapps.courseapp.dto.CourseDto;
import com.rkbapps.courseapp.entities.Courses;

@Service
public class CourseServiceImpl implements CourseServices {

    @Autowired
    private CourseDao courseDao;

    // private List<Courses> cList;

    public CourseServiceImpl() {
        // cList = new ArrayList<>();
        // cList.add(new Courses(12, "C++ Course", "Full C++ Course", 3.5));
        // cList.add(new Courses(112, "Core Java Course", "This is the ultimate java
        // course for Java newby", 4.2));
    }

    @Override
    public List<Courses> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public CourseDto getCourse(long id) {

        // for (Courses course : cList) {

        // if (course.getId() == id) {
        // return course;
        // }

        // }
        if(this.courseDao.existsById(id)){
            return CourseDto.coursesToCourseDto(this.courseDao.getReferenceById(id));
        }else{
            return new CourseDto();
        }
        
        

    }

    @Override
    public CourseDto addCourse(Courses courses) {
        // cList.add(courses);
        return CourseDto.coursesToCourseDto(courseDao.save(courses));
    }

    @Override
    public String removeCourse(long id) {

        // for (Courses c : cList) {

        // if (c.getId() == id) {
        // cList.remove(c);
        // return "Success";
        // }

        // }
        // return "Failed";+

        if (courseDao.existsById(id)) {
            courseDao.deleteById(id);
            return "Success";
        } else
            return "Failed";

    }

    @Override
    public CourseDto updateCourse(CourseDto courses) {

        // for (Courses c : cList) {

        // if (c.getId() == courses.getId()) {
        // c.setTittle(courses.getTittle());
        // c.setDescription(courses.getDescription());
        // c.setDuration(courses.getDuration());

        // return c;
        // }

        // }

        return CourseDto.coursesToCourseDto(courseDao.save(CourseDto.courseDtoToCourses(courses)));
    }

}
