package com.example.demo12.controller;

import com.example.demo12.model.Post;
import com.example.demo12.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RequestMapping("/posts")
@RestController
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping
    public List<Post> getAll(){
        return postService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Post> getPostById(@PathVariable("id") int id){
        return postService.getPostById(id);
    }

}
