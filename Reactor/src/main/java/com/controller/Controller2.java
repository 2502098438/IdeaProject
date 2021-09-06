package com.controller;

import com.entity.Student;
import com.service.StuService;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.BodyInserters.fromObject;

public class Controller2 {

    private final StuService service;

    public Controller2(StuService service) {
        this.service = service;
    }

    public Mono<ServerResponse> getStuById(ServerRequest request){
        int id = Integer.valueOf(request.pathVariable("stuId")) ;

        Mono<Student> studentMono = this.service.queryStuById(id);
        return studentMono.flatMap(student -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(fromObject(student)));
    }

    public Mono<ServerResponse> getAllStu(ServerRequest request){
        Flux<Student> studentFlux = this.service.queryAllStu();
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(studentFlux,Student.class);
    }

    public Mono<ServerResponse> addStu(ServerRequest request){
        Mono<Student> studentMono = request.bodyToMono(Student.class);
        return ServerResponse.ok().build(this.service.addStu(studentMono));
    }
}

