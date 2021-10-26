package com.drifter.kabir.MyBlog.service;

import com.drifter.kabir.MyBlog.model.Comment;

public interface CommentService {

    Comment save(Comment comment);

    void delete(Comment comment);

}
