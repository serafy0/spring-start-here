package com.example.proxies;

import org.springframework.stereotype.Component;

import com.example.models.Comment;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText());
    }

}
