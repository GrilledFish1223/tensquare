package com.ping.article.service;

import com.ping.article.dao.CommentDao;
import com.ping.article.pojo.Comment;
import com.ping.common.util.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: zhangsp
 * @date: 2019/3/20 20:25
 * @copyright: @2019
 */
@Service
public class CommentService {
    @Autowired
    private CommentDao commentDao;

    @Autowired
    private IdWorker idWorker;

    public void add(Comment comment) {
        comment.set_id(idWorker.nextId()+"");
        commentDao.save(comment);
    }

    public List<Comment> findByArticleid(String articleid) {
        return commentDao.findByArticleid(articleid);
    }
}
