package com.ping.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: zhangsp
 * @date: 2019/3/16 14:45
 * @copyright: @2019
 */
@Data
@AllArgsConstructor
public class Result {
    /**
     * 是否成功
     */
    private boolean flag;

    /**
     * 返回码
     */
    private Integer code;

    /**
     * 返回信息
     */
    private String message;

    /**
     * 返回数据
     */
    private Object data;

    public Result(boolean flag, Integer code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }
}
