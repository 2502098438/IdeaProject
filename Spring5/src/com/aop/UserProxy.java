package com.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class UserProxy {

    @Pointcut(value = "execution(* com.aop.User.add(..))")
    public void pointDemo(){

    }

    @Before(value = "pointDemo()")
    public void before(){
        System.out.println("before....");
    }

    @After(value ="execution(* com.aop.User.add(..))")
    public void after(){
        System.out.println("after....");
    }

    @Around(value ="execution(* com.aop.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前....");

        proceedingJoinPoint.proceed();

        System.out.println("环绕之后....");
    }

    @AfterThrowing(value ="execution(* com.aop.User.add(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing....");
    }

    @AfterReturning(value ="execution(* com.aop.User.add(..))")
    public void afterReturning(){
        System.out.println("AfterReturning....");
    }


}
