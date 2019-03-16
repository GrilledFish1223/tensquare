package com.ping.common.entity;


/**
 * 状态码
 * @author: zhangsp
 * @date: 2019/3/16 14:51
 * @copyright: @2019
 */
public class StatusCode {
    /**
     * 成功
     */
    public static final int OK = 20000;

    /**
     * 失败
     */
    public static final int ERROR = 20001;

    /**
     * 同户名或者密码错误
     */
    public static final int LOINERROR = 20002;

    /**
     * 权限不足
     */
    public static final int ACCESSERROR = 20003;

    /**
     * 远程调用失败
     */
    public static final int REMOTEERROR = 20004;

    /**
     * 重复操作
     */
    public static final int REPERROR = 20005;

}
