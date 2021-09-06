package com.service;

import com.entity.Student;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface StuService {

    //查询单个学生
    Mono<Student> queryStuById(int stuId);

    //查询全部学生
    Flux<Student> queryAllStu();

    //添加学生
    Mono<Void> addStu(Mono<Student> student);
}
