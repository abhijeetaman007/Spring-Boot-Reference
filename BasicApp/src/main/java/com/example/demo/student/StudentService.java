package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//Here also we need to tell that StudentService Class would be auto instantiated i.e. it has to be spring Bean -- @Component is used
//@Component
//Similar to @Component @Service improves the readability and tells this class is providing service
@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Abhijeet",
                        "abhijeet.sinha@test.com",
                        LocalDate.of(2001, Month.MARCH,5),
                        21
                )
        );
    }
}
