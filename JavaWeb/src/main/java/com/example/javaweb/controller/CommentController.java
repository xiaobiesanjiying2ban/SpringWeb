package com.example.javaweb.controller;

import com.example.javaweb.pojo.CommentTable;
import com.example.javaweb.pojo.Result;
import com.example.javaweb.service.CommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    // 添加评论
    @PostMapping("/add")
    public Result addComment(Integer MovieId, String UserId, Integer Scores, String Content) {
        LocalDateTime now = LocalDateTime.now();
        CommentTable commentTable = new CommentTable();
        commentTable.setMovieId(MovieId);
        commentTable.setUserId(UserId);
        commentTable.setScores(Scores);
        commentTable.setContent(Content);
        commentTable.setCommentDate(now);
        boolean add = commentService.addComment(commentTable);
        return add ? Result.success("评论添加成功") : Result.error("评论添加失败");
    }

    // 删除评论
    @PostMapping("/delete")
    public Result deleteComment(@RequestParam Integer id) {
        boolean success = commentService.deleteComment(id);
        return success ? Result.success("评论删除成功") : Result.error("评论删除失败");
    }

    // 更新评论
    @PostMapping("/update")
    public Result updateComment(@RequestBody CommentTable commentTable) {
        boolean success = commentService.updateComment(commentTable);
        return success ? Result.success("评论更新成功") : Result.error("评论更新失败");
    }

    // 查看评论
    @PostMapping("/all")
    public Result selectComment() {
        List<CommentTable> comments = commentService.selectComment();
        return Result.success(comments);
    }

    // 根据电影ID查看评论
    @PostMapping("/movie")
    public Result selectCommentByMovieId(@RequestParam Integer MovieId) {
        List<CommentTable> comments = commentService.selectCommentByMovieId(MovieId);
        return Result.success(comments);
    }

    // 根据用户ID查看评论
    @PostMapping("/user")
    public Result selectCommentByUserName(@RequestParam String UserId) {
        List<CommentTable> comments = commentService.selectCommentByUserName(UserId);
        return Result.success(comments);
    }
}