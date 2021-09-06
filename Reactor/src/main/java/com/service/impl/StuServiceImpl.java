package com.service.impl;

import com.entity.Student;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import com.service.StuService;

import java.util.HashMap;
import java.util.Map;

@Service
public class StuServiceImpl implements StuService {

    private final Map<Integer, Student> students = new HashMap<>();

    public StuServiceImpl() {
        this.students.put(1, new Student(1, "老大", "男"));
        this.students.put(2, new Student(2, "老二", "男"));
        this.students.put(3, new Student(3, "老三", "女"));
    }


    @Override
    public Mono<Student> queryStuById(int stuId) {
        return Mono.justOrEmpty(this.students.get(stuId));
    }

    @Override
    public Flux<Student> queryAllStu() {
        return Flux.fromIterable(this.students.values());
    }

    @Override
    public Mono<Void> addStu(Mono<Student> student) {
        return student.doOnNext(student1 -> {
            int id = students.size() + 1;
            students.put(id, student1);
        }).thenEmpty(Mono.empty());
    }
}
