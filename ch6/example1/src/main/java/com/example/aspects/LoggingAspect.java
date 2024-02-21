package com.example.aspects;

import java.util.logging.Logger;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @AfterReturning(value = "@annotation(ToLog)")
    public void log(Object returnedValue) throws Throwable {

        logger.info("Method executed and returned " + returnedValue);

    }
}
