package com.example.services;

import org.springframework.stereotype.Component;

import com.example.models.Comment;
import com.example.proxies.CommentNotificationProxy;
import com.example.repositories.CommentRepo;

@Component
public class CommentService {
    private final CommentRepo commentRepo;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepo commentRepo, CommentNotificationProxy commentNotificationProxy) {

        this.commentNotificationProxy = commentNotificationProxy;
        this.commentRepo = commentRepo;
    }

    public void publishComment(Comment comment) {
        commentRepo.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
