package com.example.restdemo1.service.impl;

import com.example.restdemo1.exception.ResourceNotFoundException;
import com.example.restdemo1.pojo.entity.Student;
import com.example.restdemo1.repository.StudentRepository;
import com.example.restdemo1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(long id) {
        Optional<Student> opStd = studentRepository.findById(id);
        if(opStd.isPresent()){
            return  opStd.get();
        }else{
            throw new ResourceNotFoundException("Cannot find student with id : " + id);
        }
    }

    @Override
    public Student createStudent(Student std) {
        return studentRepository.save(std);
    }

    @Override
    public Student updateStudentById(long id, Student std) {
        Optional<Student> opStd = studentRepository.findById(id);
        if(opStd.isPresent()){
            Student cur = opStd.get();
            cur.setName(std.getName());
            cur.setPhone(std.getPhone());
            studentRepository.save(cur);
            return cur;
        }else{
            throw new ResourceNotFoundException("Cannot find student with id : " + id);
        }
    }

    @Override
    public void deleteStudentById(long id) {
        Optional<Student> opStd = studentRepository.findById(id);
        if(opStd.isPresent()){
            studentRepository.delete(opStd.get());
        }else{
            throw new ResourceNotFoundException("Cannot find student with id : " + id);
        }
    }
}