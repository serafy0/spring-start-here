package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.models.Comment;
import com.example.services.CommentService;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var s1 = c.getBean(CommentService.class);
        Comment comment = new Comment();

        comment.setAuthor("Lara");
        comment.setText("Hello");
        ;
        s1.sendComment(comment);
    }
}