package com.drifter.kabir.MyBlog.repository;

import com.drifter.kabir.MyBlog.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
