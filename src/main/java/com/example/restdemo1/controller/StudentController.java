package com.example.restdemo1.controller;

import com.example.restdemo1.pojo.entity.Student;
import com.example.restdemo1.repository.StudentRepository;
import com.example.restdemo1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/api")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudent(){
        return ResponseEntity.ok().body(studentService.getAllStudent());
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable long id){
        return ResponseEntity.ok().body(studentService.getStudentById(id));
    }

    @PostMapping("/students")
    public ResponseEntity<Student> createStudent(@RequestBody Student std){
        return ResponseEntity.ok().body(studentService.createStudent(std));
    }

    @PutMapping("/students/{id}")
    public ResponseEntity<Student> updateStudentById(@PathVariable long id, @RequestBody Student std){
        return ResponseEntity.ok().body(studentService.updateStudentById(id, std));
    }

    @DeleteMapping("/students/{id}")
    public HttpStatus deleteStudentById(@PathVariable long id){
        studentService.deleteStudentById(id);
        return HttpStatus.OK;
    }
}
