package com.example;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.models.Comment;
import com.example.services.CommentService;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service = c.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("Demmo comment");
        comment.setAuthor("Natasha");

        service.publishComment(comment);
        service.editComment(comment);
        service.deleteComment(comment);
    }
}