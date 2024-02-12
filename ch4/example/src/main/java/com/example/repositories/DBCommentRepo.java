package com.example.repositories;

import com.example.models.Comment;

public class DBCommentRepo implements CommentRepo {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }

}
