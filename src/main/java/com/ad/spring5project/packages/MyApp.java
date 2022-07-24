package com.ad.spring5project.packages;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class MyApp {

    @GetMapping("/")
    public Student helloExample(){
        return new Student(1,"ADwait","IT");
    }

    @GetMapping("/list")
    public List<Student> listOfStudents(){
        return List.of(
                new Student(1,"ADwait","IT"),
                new Student(1,"AD","CS"),
                new Student(1,"wait","Mech"),
                new Student(1,"lucky","Extc")
        );
    }

    @GetMapping("/stu")
    public Student student(){
        return new Student(1,"ADwait","IT");
    }
}
