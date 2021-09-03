package com.example.demo12.repository;

import com.example.demo12.model.Post;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface PostRepository {

    public List<Post> getAll();

    public Optional<Post> getPostById(int id);
}
