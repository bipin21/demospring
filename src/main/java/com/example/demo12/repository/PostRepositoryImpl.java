package com.example.demo12.repository;

import com.example.demo12.model.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@Repository
public class PostRepositoryImpl implements PostRepository {

    List<Post> posts = new ArrayList<>(Arrays.asList(
            new Post(1, "A", "B", "C"),
            new Post(2, "AA", "BB", "CC")
    ));

    @Override
    public List<Post> getAll() {
        return posts;
    }

    @Override
    public Optional<Post> getPostById(int id) {
        return posts.stream().filter(p -> p.getId() == id).findFirst();
    }
}
