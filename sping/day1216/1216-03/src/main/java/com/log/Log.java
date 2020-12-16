package com.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
public class Log {
    @Before("execution(* com.baidu.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("before----------");
    }
    @After("execution(* com.baidu.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("after-----------");
    }
    @Around("execution(* com.baidu.UserServiceImpl.*(..)))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("before-----------around");
        Object proceed =jp.proceed();
        System.out.println("after-----------around");
    }
}
