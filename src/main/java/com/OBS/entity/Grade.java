package com.OBS.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Student  student;
    private String subject;
    private Double score;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public Student getStudent(){
        return student;
    }
    public void setStudent(Student student){
        this.student=student;
    }
    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject=subject;
    }
    public Double getScore(){
        return score;
    }
    public void setScore(Double score){
        this.score=score;
    }

}
