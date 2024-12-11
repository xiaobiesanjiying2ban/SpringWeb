package com.example.javaweb.controller;

import com.example.javaweb.pojo.CommentTable;
import com.example.javaweb.service.CommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private  CommentService commentService;

    
    // 添加评论
    @PostMapping("/add")
    public boolean addComment(@RequestBody CommentTable commentTable) {
        return commentService.addComment(commentTable);
    }

    // 删除评论
    @PostMapping("/delete")
    public boolean deleteComment(@RequestBody CommentTable commentTable) {
        return commentService.deleteComment(commentTable);
    }

    // 更改评论
    @PostMapping("/update")
    public boolean updateComment(@RequestBody CommentTable commentTable) {
        return commentService.updateComment(commentTable);
    }

    // 查看评论
    @PostMapping("/all")
    public List<CommentTable> selectComment() {
        return commentService.selectComment();
    }

    // 根据电影ID查看评论
    @PostMapping("/movie")
    public List<CommentTable> selectCommentByMovieId(@RequestBody CommentTable commentTable) {
        return commentService.selectCommentByMovieId(commentTable.getMovieId());
    }

    // 根据用户ID查看评论
    @PostMapping("/user")
    public List<CommentTable> selectCommentByUserName(@RequestBody CommentTable commentTable) {
        return commentService.selectCommentByUserName(commentTable.getUserId());
    }
}