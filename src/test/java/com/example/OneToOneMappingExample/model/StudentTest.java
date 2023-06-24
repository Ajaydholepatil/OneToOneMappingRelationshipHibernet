package com.example.OneToOneMappingExample.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class StudentTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Student}
     *   <li>{@link Student#setCollageName(String)}
     *   <li>{@link Student#setName(String)}
     *   <li>{@link Student#setPrnNo(String)}
     *   <li>{@link Student#setStudent_Id(int)}
     *   <li>{@link Student#setUniversity(University)}
     *   <li>{@link Student#getCollageName()}
     *   <li>{@link Student#getUniversity()}
     *   <li>{@link Student#getName()}
     *   <li>{@link Student#getPrnNo()}
     *   <li>{@link Student#getStudent_Id()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Student actualStudent = new Student();
        actualStudent.setCollageName("Collage Name");
        actualStudent.setName("Name");
        actualStudent.setPrnNo("Prn No");
        actualStudent.setStudent_Id(1);
        Student student = new Student();
        student.setCollageName("Collage Name");
        student.setName("Name");
        student.setPrnNo("Prn No");
        student.setStudent_Id(1);
        University university = new University();
        student.setUniversity(university);
        University university1 = new University();
        university1.setCity("Oxford");
        university1.setCountry("GB");
        university1.setLocation(1);
        university1.setName("Name");
        university1.setState("MD");
        university1.setStudent(student);
        university1.setStudent_Id(1);
        Student student1 = new Student();
        student1.setCollageName("Collage Name");
        student1.setName("Name");
        student1.setPrnNo("Prn No");
        student1.setStudent_Id(1);
        student1.setUniversity(university1);
        University university2 = new University();
        university2.setCity("Oxford");
        university2.setCountry("GB");
        university2.setLocation(1);
        university2.setName("Name");
        university2.setState("MD");
        university2.setStudent(student1);
        university2.setStudent_Id(1);
        actualStudent.setUniversity(university2);
        assertEquals("Collage Name", actualStudent.getCollageName());
        University university3 = actualStudent.getUniversity();
        Student student2 = university3.getStudent();
        assertEquals("Collage Name", student2.getCollageName());
        University university4 = student2.getUniversity();
        Student student3 = university4.getStudent();
        assertEquals("Collage Name", student3.getCollageName());
        assertEquals("Name", actualStudent.getName());
        assertEquals("Name", student2.getName());
        assertEquals("Name", student3.getName());
        assertEquals("Prn No", actualStudent.getPrnNo());
        assertEquals("Prn No", student2.getPrnNo());
        assertEquals("Prn No", student3.getPrnNo());
        assertEquals(1, actualStudent.getStudent_Id());
        assertEquals(1, student2.getStudent_Id());
        assertEquals(1, student3.getStudent_Id());
        assertSame(university2, university3);
        assertSame(university1, university4);
        assertSame(university, student3.getUniversity());
    }
}

