package com.nowcoder.community.service.impl;

import com.nowcoder.community.entity.DiscussPost;
import com.nowcoder.community.mapper.DiscussPostMapper;
import com.nowcoder.community.service.DiscussPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussPostServiceimpl implements DiscussPostService {

    @Autowired
    private DiscussPostMapper dicussPostMapper;

    @Override
    public List<DiscussPost> findDiscussPostById(int userId, int offset, int limit, int orderMode) {
        List<DiscussPost> discussPosts = dicussPostMapper.selectDiscussPostById(userId, offset, limit, orderMode);
        return discussPosts;
    }
    public int findDiscussPostRows(int userId){
        return dicussPostMapper.selectDiscussPostRows(userId);
    }
}
