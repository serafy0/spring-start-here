package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.services.CommentService;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("Before retrieving the CommentService");

        var service = c.getBean(CommentService.class);

        System.out.println("After retrieving the CommentService");
    }
}