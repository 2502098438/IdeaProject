/*
package com.controller;

import com.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import com.service.StuService;

@RestController
public class Controller {

    @Autowired
    private StuService service;

    @GetMapping("/student/{id}")
    public Mono<Student> queryStuById(@PathVariable int id){
        return service.queryStuById(id);
    }

    @GetMapping("/student")
    public Flux<Student> queryAllStu(){
        return service.queryAllStu();
    }

    @PostMapping("/addStudent")
    public Mono<Void> addStudent(@RequestBody Student student){
        Mono<Student> mono = Mono.just(student);
        return service.addStu(mono);
    }
}
*/
