package com.example.OneToOneMappingExample.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "student")

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int student_Id;

    @OneToOne(mappedBy = "student")
    @Cascade(value = org.hibernate.annotations.CascadeType.ALL)
    private University university;

    private String name;

    private String collageName;

    private String PrnNo;

    public int getStudent_Id() {
        return student_Id;
    }

    public void setStudent_Id(int student_Id) {
        this.student_Id = student_Id;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollageName() {
        return collageName;
    }

    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }

    public String getPrnNo() {
        return PrnNo;
    }

    public void setPrnNo(String prnNo) {
        PrnNo = prnNo;
    }
}
