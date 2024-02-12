package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.models.Comment;
import com.example.proxies.EmailCommentNotificationProxy;
import com.example.repositories.DBCommentRepo;
import com.example.services.CommentService;

public class Main {
    public static void main(String[] args) {

        var conetxt = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var comment = new Comment();
        var commentService = conetxt.getBean(CommentService.class);

        comment.setAuthor("Lara");
        comment.setText("Demo comment");

        commentService.publishComment(comment);

    }
}