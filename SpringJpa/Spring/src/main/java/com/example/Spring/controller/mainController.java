package com.example.Spring.controller;

import com.example.Spring.Repository.StudentRepository;
import com.example.Spring.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {

    @Autowired
    StudentRepository studentRepository;

    void saveStudent(){
        Student student= Student.builder().emailId("vinishajoshi2000@gmail.com")
                .firstName("vinisha").lastName("joshi").build();
        studentRepository.save(student);

    }
}
