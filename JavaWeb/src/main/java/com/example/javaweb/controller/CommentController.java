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

    private final CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    // 添加评论
    @PostMapping("/add")
    public boolean addComment(@RequestBody CommentTable commentTable) {
        return commentService.addComment(commentTable);
    }

    // 删除评论
    @DeleteMapping("/delete/{id}")
    public boolean deleteComment(@PathVariable int id) {
        return commentService.deleteComment(new CommentTable(id, 0, "", 0, "", null));
    }

    // 更改评论
    @PutMapping("/update")
    public boolean updateComment(@RequestBody CommentTable commentTable) {
        return commentService.updateComment(commentTable);
    }

    // 查看评论
    @GetMapping("/all")
    public List<CommentTable> selectComment() {
        return commentService.selectComment();
    }

    // 根据电影名查看评论
    @GetMapping("/movie/{movieId}")
    public List<CommentTable> selectCommentByMovieId(@PathVariable int movieId) {
        return commentService.selectCommentByMovieId(movieId);
    }

    // 根据用户查看评论
    @GetMapping("/user/{userId}")
    public List<CommentTable> selectCommentByUserName(@PathVariable String userId) {
        return commentService.selectCommentByUserName(userId);
    }
}