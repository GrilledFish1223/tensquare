package com.ping.common.entity;

import lombok.Data;

/**
 * @author: zhangsp
 * @date: 2019/3/16 14:45
 * @copyright: @2019
 */
@Data
public class Result {
    /**
     * 是否成功
     */
    private boolean flag;

    /**
     * 返回码
     */
    private  Integer code;

    /**
     * 返回信息
     */
    private String message;

    /**
     * 返回数据
     */
    private Object data;
}
