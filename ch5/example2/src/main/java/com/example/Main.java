package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.services.CommentService;
import com.example.services.UserService;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var s1 = c.getBean(CommentService.class);
        var s2 = c.getBean(UserService.class);

        boolean b = s1.getCommentRepository() == s2.getCommentRepository(); // always false

        System.out.println(b);
    }
}