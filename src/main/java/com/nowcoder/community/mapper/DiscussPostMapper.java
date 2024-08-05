package com.nowcoder.community.mapper;

import com.nowcoder.community.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Value;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
    List<DiscussPost> selectDiscussPostById(int userId, int offset, int limit, int orderMode);

    int selectDiscussPostRows(@Param("userId") int userId);


}
