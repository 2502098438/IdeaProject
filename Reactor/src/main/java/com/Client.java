package com;

import com.entity.Student;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

public class Client {
    public static void main(String[] args) {
        //调用服务器地址
        WebClient webClient = WebClient.create("http://127.0.0.1:61827");
        //根据 id 查询
        String id = "1";
        Student studentresult = webClient.get().uri("/student/{id}", id)
                .accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(Student
                        .class)
                .block();
        System.out.println(studentresult);
        //查询所有
        Flux<Student> results = webClient.get().uri("/student")
                .accept(MediaType.APPLICATION_JSON).retrieve().bodyToFlux(Student
                        .class);
        results.map(stu -> stu)
                .buffer().doOnNext(System.out::println).blockFirst();
    }
}
