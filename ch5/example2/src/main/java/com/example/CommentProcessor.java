package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.models.Comment;
import com.example.repos.CommentRepository;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentProcessor {

    private Comment comment;

    @Autowired
    private CommentRepository commentRepository;

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Comment getComment() {
        return this.comment;
    }

    public void processComment(Comment comment) {
        System.out.println("changing comment attribute");
    }

    public void validateComment(Comment comment) {
        System.out.println("validating and changing the comment attribute");
    }
}
