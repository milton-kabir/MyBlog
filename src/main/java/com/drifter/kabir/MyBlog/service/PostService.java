package com.drifter.kabir.MyBlog.service;

import com.drifter.kabir.MyBlog.model.Post;

import java.util.Collection;
import java.util.Optional;

public interface PostService {

    Optional<Post> getById(Long id);

    Collection<Post> getAll();

    Post save(Post post);

    void delete(Post post);
}

