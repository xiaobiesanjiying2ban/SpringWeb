package com.example.javaweb.mapper;

import com.example.javaweb.pojo.CommentTable;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentMapper {
    // 添加评论
    @Insert("insert into comment(MovieId,UserId,Scores,Content) values (#{MovieId},#{UserId},#{Scores},#{Content})")
    int insertComment(CommentTable comment);
    // 删除评论
    @Delete("delete ")
    int deleteComment(int id);
    // 更改评论
    // 查看评论
}
