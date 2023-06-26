package com.example.phtotheofdayupdate2.logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class Logger {
    @After("execution(* com.example.phtotheofdayupdate2.controller.PhotoController.doCreate(..))")
    public void logAfterMethodController(JoinPoint joinPoint) {
        String args = Arrays.toString(joinPoint.getArgs());
        String method = joinPoint.getSignature().getName();
        System.err.println("The method just called is:" + method);



    }
}
