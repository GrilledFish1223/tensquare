package com.ping.article.controller;

import com.ping.article.pojo.Comment;
import com.ping.article.service.CommentService;
import com.ping.common.entity.Result;
import com.ping.common.entity.StatusCode;
import jdk.net.SocketFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: zhangsp
 * @date: 2019/3/20 20:27
 * @copyright: @2019
 */
@RestController
@CrossOrigin
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping
    public Result save(@RequestBody Comment comment) {
        commentService.add(comment);
        return new Result(true, StatusCode.OK,"提交成功");
    }

    @GetMapping(value = "/article/{articleid}")
    public Result findByArticleid(@PathVariable String articleid) {
        return new Result(true,StatusCode.OK,"查询成功",commentService.findByArticleid(articleid));
    }
}
