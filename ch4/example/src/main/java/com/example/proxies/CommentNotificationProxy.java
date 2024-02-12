package com.example.proxies;

import com.example.models.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
