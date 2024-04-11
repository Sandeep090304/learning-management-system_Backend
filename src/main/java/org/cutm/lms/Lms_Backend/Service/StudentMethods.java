package org.cutm.lms.Lms_Backend.Service;

import org.cutm.lms.Lms_Backend.Entity.Student;

import java.util.List;

public interface StudentMethods {
    Student createStudent();

    //get the particular Student
    Student getAdminById();

    //List of Student
    List<Student> getAllStudent();

    //Delete the Student
    void deleteStudent(String id);

    //update the Student
    Student updateStudent(String id,Student updatedAdmin);
}