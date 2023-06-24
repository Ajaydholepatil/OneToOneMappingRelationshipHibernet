package com.example.OneToOneMappingExample.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

class UniversityTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link University}
     *   <li>{@link University#setCity(String)}
     *   <li>{@link University#setCountry(String)}
     *   <li>{@link University#setLocation(int)}
     *   <li>{@link University#setName(String)}
     *   <li>{@link University#setState(String)}
     *   <li>{@link University#setStudent(Student)}
     *   <li>{@link University#setStudent_Id(int)}
     *   <li>{@link University#getCity()}
     *   <li>{@link University#getStudent()}
     *   <li>{@link University#getCountry()}
     *   <li>{@link University#getLocation()}
     *   <li>{@link University#getName()}
     *   <li>{@link University#getState()}
     *   <li>{@link University#getStudent_Id()}
     * </ul>
     */
    @Test
    void testConstructor() {
        University actualUniversity = new University();
        actualUniversity.setCity("Oxford");
        actualUniversity.setCountry("GB");
        actualUniversity.setLocation(1);
        actualUniversity.setName("Name");
        actualUniversity.setState("MD");
        University university = new University();
        university.setCity("Oxford");
        university.setCountry("GB");
        university.setLocation(1);
        university.setName("Name");
        university.setState("MD");
        Student student = new Student();
        university.setStudent(student);
        university.setStudent_Id(1);
        Student student1 = new Student();
        student1.setCollageName("Collage Name");
        student1.setName("Name");
        student1.setPrnNo("Prn No");
        student1.setStudent_Id(1);
        student1.setUniversity(university);
        University university1 = new University();
        university1.setCity("Oxford");
        university1.setCountry("GB");
        university1.setLocation(1);
        university1.setName("Name");
        university1.setState("MD");
        university1.setStudent(student1);
        university1.setStudent_Id(1);
        Student student2 = new Student();
        student2.setCollageName("Collage Name");
        student2.setName("Name");
        student2.setPrnNo("Prn No");
        student2.setStudent_Id(1);
        student2.setUniversity(university1);
        actualUniversity.setStudent(student2);
        actualUniversity.setStudent_Id(1);
        assertEquals("Oxford", actualUniversity.getCity());
        Student student3 = actualUniversity.getStudent();
        University university2 = student3.getUniversity();
        assertEquals("Oxford", university2.getCity());
        Student student4 = university2.getStudent();
        University university3 = student4.getUniversity();
        assertEquals("Oxford", university3.getCity());
        assertEquals("GB", actualUniversity.getCountry());
        assertEquals("GB", university2.getCountry());
        assertEquals("GB", university3.getCountry());
        assertEquals(1, actualUniversity.getLocation());
        assertEquals(1, university2.getLocation());
        assertEquals(1, university3.getLocation());
        assertEquals("Name", actualUniversity.getName());
        assertEquals("Name", university2.getName());
        assertEquals("Name", university3.getName());
        assertEquals("MD", actualUniversity.getState());
        assertEquals("MD", university2.getState());
        assertEquals("MD", university3.getState());
        assertSame(student2, student3);
        assertSame(student1, student4);
        assertSame(student, university3.getStudent());
        assertEquals(1, actualUniversity.getStudent_Id());
        assertEquals(1, university2.getStudent_Id());
        assertEquals(1, university3.getStudent_Id());
    }
}

