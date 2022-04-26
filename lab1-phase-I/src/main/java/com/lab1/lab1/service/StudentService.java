package com.lab1.lab1.service;

import com.lab1.lab1.model.Student;

import java.util.List;

public interface StudentService {

    void save(Student s);
    void delete(int id);
    List<Student> getAll();
    Student getById(int id);
}
