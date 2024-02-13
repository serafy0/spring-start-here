package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.repos.CommentRepository;

public class UserService {

    @Autowired
    private CommentRepository commentRepository;

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
