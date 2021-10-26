package com.drifter.kabir.MyBlog.service;

import com.drifter.kabir.MyBlog.model.Comment;
import com.drifter.kabir.MyBlog.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService{

    private final CommentRepository commentRepository;

    @Autowired
    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public Comment save(Comment comment) {
        return commentRepository.saveAndFlush(comment);
    }

    @Override
    public void delete(Comment comment) {
        commentRepository.delete(comment);
    }
}
