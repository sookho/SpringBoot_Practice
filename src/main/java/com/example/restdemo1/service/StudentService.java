package com.example.restdemo1.service;

import com.example.restdemo1.pojo.entity.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public interface StudentService {
    List<Student> getAllStudent();
    Student getStudentById(long id);

    Student createStudent(Student std);

    Student updateStudentById(long id, Student std);

    void deleteStudentById(long id);


}