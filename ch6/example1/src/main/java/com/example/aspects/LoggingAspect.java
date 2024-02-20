package com.example.aspects;

import java.util.Arrays;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* com.example.services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();

        Object[] arguments = joinPoint.getArgs();

        logger.info("Method" + methodName + "with parameters" + Arrays.asList(arguments) + "will execute");
        Object returnedMethod = joinPoint.proceed();
        logger.info("Method executed and returned " + returnedMethod);
    }
}
