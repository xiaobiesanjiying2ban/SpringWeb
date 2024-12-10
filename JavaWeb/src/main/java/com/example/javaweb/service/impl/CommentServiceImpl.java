package com.example.javaweb.service.impl;

import com.example.javaweb.mapper.CommentMapper;
import com.example.javaweb.pojo.CommentTable;
import com.example.javaweb.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    private final CommentMapper commentMapper;

    @Autowired
    public CommentServiceImpl(CommentMapper commentMapper) {
        this.commentMapper = commentMapper;
    }

    // 添加评论
    @Override
    public boolean addComment(CommentTable commentTable) {
        int result = commentMapper.insertComment(commentTable);
        return result > 0;
    }

    // 删除评论
    @Override
    public boolean deleteComment(CommentTable commentTable) {
        int result = commentMapper.deleteComment(commentTable.getId());
        return result > 0;
    }

    // 更改评论
    @Override
    public boolean updateComment(CommentTable commentTable) {
        int result = commentMapper.updateComment(commentTable);
        return result > 0;
    }

    // 查看评论
    @Override
    public List<CommentTable> selectComment(){
        return commentMapper.selectAllComment();
    }

    // 根据电影名查看评论
    @Override
    public List<CommentTable> selectCommentByMovieId(int movieId){
        return commentMapper.selectCommentsByMovieId(movieId);
    }

    // 根据用户查看评论
    @Override
    public List<CommentTable> selectCommentByUserName(String userName){
        return commentMapper.selectCommentsByUserId(userName);
    }
}