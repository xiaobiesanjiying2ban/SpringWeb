package com.example.javaweb.mapper;

import com.example.javaweb.pojo.CommentTable;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CommentMapper {
    // 添加评论
    @Insert("insert into comment(MovieId,UserId,Scores,Content) values (#{MovieId},#{UserId},#{Scores},#{Content})")
    int insertComment(CommentTable comment);
    // 删除评论
    @Delete("delete from comment where id = #{id}")
    int deleteComment(int id);
    // 更改评论
    @Update("update comment set MovieId = #{MovieId}, UserId = #{UserId}, Scores = #{Scores}, Content = #{Content} where id = #{id}")
    int updateComment(CommentTable comment);
    // 查看评论
    @Select("select * from comment")
    List<CommentTable> selectAllComment();
    // 根据电影名查看评论
    @Select("select * from comment where MovieId = #{MovieId}")
    List<CommentTable> selectCommentsByMovieId(int movieId);
    // 根据用户查看评论
    @Select("select * from comment where UserId = #{UserId}")
    List<CommentTable> selectCommentsByUserId(String userId);
}
