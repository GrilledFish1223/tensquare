package com.ping.qa.controller;

import com.ping.common.entity.PageResult;
import com.ping.common.entity.Result;
import com.ping.common.entity.StatusCode;
import com.ping.qa.pojo.Problem;
import com.ping.qa.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;


/**
 * @author: zhangsp
 * @date: 2019/3/19 21:03
 * @copyright: @2019
 */
@RestController
@CrossOrigin
@RequestMapping("/problem")
public class ProblemController {
    @Autowired
    private ProblemService problemService;

    @GetMapping(value = "/newlist/{labelid}/{page}/{size}")
    public Result findNewListByLabelId(@PathVariable String labelid, @PathVariable int page, @PathVariable int size) {
        Page<Problem> pageList =
                problemService.findNewListByLabelId(labelid, page, size);
        PageResult<Problem> pageResult = new PageResult<>
                (pageList.getTotalElements(), pageList.getContent());
        return new Result(true, StatusCode.OK, "查询成功", pageResult);
    }

    /**
     * 根据标签ID查询热门问题列表
     *
     * @param labelid
     * @return
     */
    @GetMapping(value = "/hotlist/{labelid}/{page}/{size}")
    public Result findHotListByLabelId(@PathVariable String
                                               labelid, @PathVariable int page, @PathVariable int size) {
        Page<Problem> pageList =
                problemService.findHotListByLabelId(labelid, page, size);
        PageResult<Problem> pageResult = new PageResult<>
                (pageList.getTotalElements(), pageList.getContent());
        return new Result(true, StatusCode.OK, "查询成功", pageResult);
    }

    /**
     * 根据标签ID查询等待回答列表
     *
     * @param labelid
     * @return
     */
    @GetMapping(value = "/waitlist/{labelid}/{page}/{size}")
    public Result findWaitListByLabelId(@PathVariable String
                                                labelid, @PathVariable int page, @PathVariable int size) {
        Page<Problem> pageList =
                problemService.findWaitListByLabelId(labelid, page, size);
        PageResult<Problem> pageResult = new PageResult<>
                (pageList.getTotalElements(), pageList.getContent());
        return new Result(true, StatusCode.OK, "查询成功", pageResult);
    }
}
