package com.rkbapps.courseapp.dto;

import com.rkbapps.courseapp.entities.Courses;

public class CourseDto {

    private long id;

    private String tittle;

    private Double duration;
    private String description;

    public CourseDto() {
    }

    public CourseDto(long id, String tittle, String description, Double duration) {
        this.id = id;
        this.tittle = tittle;
        this.description = description;
        this.duration = duration;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }



    public static Courses courseDtoToCourses(CourseDto courseDto){
        return new Courses(courseDto.getId(),courseDto.getTittle(),courseDto.getDescription(),courseDto.getDuration());
    }

    public static CourseDto coursesToCourseDto(Courses courses){
        return new CourseDto(courses.getId(),courses.getTittle(),courses.getDescription(),courses.getDuration());
    }


}
