package com.rkbapps.courseapp.model;

public class Courses {
    private long id;
    private String tittle;
    private String description;
    private Double duration;
    
    public Courses(long id, String tittle, String description, Double duration) {
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



    
}
