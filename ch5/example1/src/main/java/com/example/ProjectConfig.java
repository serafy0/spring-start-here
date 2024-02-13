package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.services.CommentService;

@Configuration
@ComponentScan(basePackages = "com.example")
public class ProjectConfig {

    @Bean
    public CommentService commentService() {
        return new CommentService();
    }

}
