package com.nowcoder.community.service;

import com.nowcoder.community.entity.DiscussPost;
import com.nowcoder.community.entity.DiscussPost;
import com.nowcoder.community.mapper.DiscussPostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DiscussPostService {

    List<DiscussPost> findDiscussPostById (int userId, int offset, int limit, int orderMode);


    int findDiscussPostRows(int userId);
}
