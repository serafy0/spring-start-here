package com.example.services;

import com.example.models.Comment;
import com.example.proxies.CommentNotificationProxy;
import com.example.repositories.CommentRepo;

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
