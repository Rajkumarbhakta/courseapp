package com.rkbapps.courseapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rkbapps.courseapp.entities.Courses;


public interface CourseDao extends JpaRepository<Courses,Long> {


    
}
