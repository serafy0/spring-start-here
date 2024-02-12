package com.example.repositories;

import org.springframework.stereotype.Repository;

import com.example.models.Comment;

@Repository
public class DBCommentRepo implements CommentRepo {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }

}
