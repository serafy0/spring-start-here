package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.models.Comment;
import com.example.proxies.CommentNotificationProxy;
import com.example.repositories.CommentRepo;

@Component
public class CommentService {

    @Autowired
    private CommentRepo commentRepo;
    @Autowired
    private CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepo commentRepo2, CommentNotificationProxy commentNotificationProxy2) {
        // TODO Auto-generated constructor stub
    }

    public void publishComment(Comment comment) {
        commentRepo.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
