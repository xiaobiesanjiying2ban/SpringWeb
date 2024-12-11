package com.example.javaweb.service;

import com.example.javaweb.pojo.CommentTable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommentService {
    // 添加评论
    boolean addComment(CommentTable commentTable);
    // 删除评论
    boolean deleteComment(int id);
    // 更改评论
    boolean updateComment(CommentTable commentTable);
    // 查看评论
    List<CommentTable> selectComment();
    // 根据电影名查看评论
    List<CommentTable> selectCommentByMovieId(int movieId);
    // 根据用户查看评论
    List<CommentTable> selectCommentByUserName(String UserId);
}