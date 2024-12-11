package com.example.javaweb.mapper;

import com.example.javaweb.pojo.CommentTable;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CommentMapper {
    // 添加评论
    @Insert("INSERT INTO comment (MovieId, UserId, Scores, Content, CommentDate) VALUES (#{MovieId}, #{UserId}, #{Scores}, #{Content}, #{CommentDate})")
    int insertComment(CommentTable comment);
    // 删除评论
    @Delete("DELETE FROM comment WHERE id = #{id}")
    int deleteComment(int id);
    // 更改评论
    @Update("UPDATE comment SET MovieId = #{MovieId}, UserId = #{UserId}, Scores = #{Scores}, Content = #{Content}, CommentDate = #{CommentDate} WHERE id = #{id}")
    int updateComment(CommentTable comment);
    // 查看评论
    @Select("SELECT * FROM comment")
    List<CommentTable> selectAllComment();
    // 根据电影名查看评论
    @Select("SELECT * FROM comment WHERE MovieId = #{MovieId}")
    List<CommentTable> selectCommentsByMovieId(int movieId);
    // 根据用户查看评论
    @Select("SELECT * FROM comment WHERE UserId = #{UserId}")
    List<CommentTable> selectCommentsByUserId(String UserId);
}