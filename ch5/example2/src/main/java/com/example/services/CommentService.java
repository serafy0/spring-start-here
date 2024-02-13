package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.example.CommentProcessor;
import com.example.models.Comment;

@Service
public class CommentService {

    @Autowired
    private ApplicationContext context;

    public void sendComment(Comment c) {
        CommentProcessor p = context.getBean(CommentProcessor.class);
        p.setComment(c);
        p.processComment(c);
        p.validateComment(c);

        c = p.getComment();
    }
}
