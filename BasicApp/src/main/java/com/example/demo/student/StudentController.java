package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//All resources for APIs
@RestController
@RequestMapping(path="api/v1/student")
public class StudentController {

    private final StudentService studentService;

//    StudentService would be autowired for us i.e. automatically instantiated -- using dependency injections with help of auto wired annotations
//    Further @Component is used to make bean of StudentService Class
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

}
