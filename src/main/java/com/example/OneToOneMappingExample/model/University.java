package com.example.OneToOneMappingExample.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "university")

public class University {

    @Id
    @GeneratedValue (generator = "gen")
    @GenericGenerator(name = "gen",strategy = "foreign",parameters ={@org.hibernate.annotations.Parameter(name = "property",value = "student")})
    private int student_Id;
    private int location;
    private String name;
    private String country;
    @PrimaryKeyJoinColumn
    @OneToOne
    private  Student student;
    private String state;
    private String city;

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public int getStudent_Id() {
        return student_Id;
    }

    public void setStudent_Id(int student_Id) {
        this.student_Id = student_Id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
