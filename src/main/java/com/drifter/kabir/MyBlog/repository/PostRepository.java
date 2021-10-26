package com.drifter.kabir.MyBlog.repository;

import com.drifter.kabir.MyBlog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    Collection<Post> findAllByOrderByCreationDateDesc();

    Optional<Post> findById(Long id);
}
