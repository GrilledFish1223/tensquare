package com.ping.article.dao;

import com.ping.article.pojo.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author: zhangsp
 * @date: 2019/3/20 20:19
 * @copyright: @2019
 */

public interface CommentDao extends MongoRepository<Comment, String> {

    /**
     * 根据文章Id查询评论列表
     * @param articleid
     * @return
     */
    public List<Comment> findByArticleid(String articleid);
}
