package com.example.demo12.service;

import com.example.demo12.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface PostService {
    public List<Post> getAll();

    public Optional<Post> getPostById(int id);
}
