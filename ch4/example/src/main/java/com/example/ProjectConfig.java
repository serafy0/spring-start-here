package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.proxies.CommentNotificationProxy;
import com.example.proxies.EmailCommentNotificationProxy;
import com.example.repositories.CommentRepo;
import com.example.repositories.DBCommentRepo;
import com.example.services.CommentService;

@Configuration
public class ProjectConfig {

    @Bean
    public CommentNotificationProxy CommentNotificationProxy() {
        return new EmailCommentNotificationProxy();
    }

    @Bean
    public CommentRepo commentRepo() {
        return new DBCommentRepo();
    }

    @Bean
    public CommentService commentService(CommentRepo commentRepo, CommentNotificationProxy commentNotificationProxy) {
        return new CommentService(commentRepo, commentNotificationProxy);

    }

}
