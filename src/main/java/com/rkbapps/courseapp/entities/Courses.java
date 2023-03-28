package com.rkbapps.courseapp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Courses {

    @jakarta.persistence.Id
    @Column(name = "id")
    private long id;
    @Column(name = "tittle")
    private String tittle;
    @Column(name = "description")
    private String description;
    @Column(name = "duration")
    private Double duration;

    public Courses() {
    }

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
