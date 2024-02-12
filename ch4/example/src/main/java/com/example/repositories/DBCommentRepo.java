package com.example.repositories;

import org.springframework.stereotype.Component;

import com.example.models.Comment;

@Component
public class DBCommentRepo implements CommentRepo {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }

}
