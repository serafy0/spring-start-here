package com.example;

import com.example.models.Comment;
import com.example.proxies.EmailCommentNotificationProxy;
import com.example.repositories.DBCommentRepo;
import com.example.services.CommentService;

public class Main {
    public static void main(String[] args) {

        var commentRepository = new DBCommentRepo();
        var commentNotificationProxy = new EmailCommentNotificationProxy();

        var commentService = new CommentService(commentRepository, commentNotificationProxy);

        var comment = new Comment();
        comment.setAuthor("Lara");
        comment.setText("Demo comment");

        commentService.publishComment(comment);

    }
}