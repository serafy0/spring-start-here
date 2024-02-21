package com.example.aspects;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(2)
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around(value = "@annotation(ToLog)")
    public Object log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        logger.info("Logging Aspect: Calling the intercepted method");

        Object returnedValue = proceedingJoinPoint.proceed();

        logger.info("Method executed and returned " + returnedValue);

        return returnedValue;
    }
}
