package edu.sabanciuniv.schoolrestproject.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    private Proffessor proffessor;

    @ManyToMany
    private List<Student> studentList = new ArrayList<>();


    public Course() {

    }

    public Course(String name, Proffessor proffessor) {
        this.name = name;
        this.proffessor = proffessor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Proffessor getProffessor() {
        return proffessor;
    }

    public void setProffessor(Proffessor proffessor) {
        this.proffessor = proffessor;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
