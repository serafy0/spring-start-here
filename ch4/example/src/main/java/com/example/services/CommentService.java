package com.example.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.models.Comment;
import com.example.proxies.CommentNotificationProxy;
import com.example.repositories.CommentRepo;

@Service
public class CommentService {

    private CommentRepo commentRepo;
    private CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepo commentRepo,
            @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy) {
        this.commentNotificationProxy = commentNotificationProxy;
        this.commentRepo = commentRepo;
    }

    public void publishComment(Comment comment) {
        commentRepo.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
