package com.example.services;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.example.customAnnotations.ToLog;
import com.example.models.Comment;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment) {
        logger.info("Publish comment" + comment.getText());

    }

    @ToLog
    public void deleteComment(Comment comment) {
        logger.info("Deleteing comment:" + comment.getText());
    }

    public void editComment(Comment comment) {
        logger.info("Editing comment:" + comment.getText());
    }

}