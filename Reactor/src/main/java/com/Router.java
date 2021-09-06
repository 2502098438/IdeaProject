package com;

import com.controller.Controller2;
import com.service.StuService;
import com.service.impl.StuServiceImpl;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.http.server.reactive.ReactorHttpHandlerAdapter;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.netty.http.server.HttpServer;

import java.io.IOException;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.toHttpHandler;


//创建Router路由
public class Router {

    //最终调用
    public static void main(String[] args) throws IOException {
        Router router = new Router();
        router.creatReactor();
        System.out.println("enter to exit");
        System.in.read();
    }

    public RouterFunction<ServerResponse> routerFunction(){
        StuService service = new StuServiceImpl();
        Controller2 controller2 = new Controller2(service);

        //设置路由
        return RouterFunctions.route(
                GET("/student/{stuId}").and(accept(APPLICATION_JSON)),controller2::getStuById)
                .andRoute(GET("/student").and(accept(APPLICATION_JSON)),controller2::getAllStu);
    }

    //创建服务器完成适配
    public void creatReactor(){
        //路由和 handler 适配
        RouterFunction<ServerResponse> route = routerFunction();
        HttpHandler httpHandler = toHttpHandler(route);
        ReactorHttpHandlerAdapter adapter = new
                ReactorHttpHandlerAdapter(httpHandler);
        //创建服务器
        HttpServer httpServer = HttpServer.create();
        httpServer.handle(adapter).bindNow();
    }

}
