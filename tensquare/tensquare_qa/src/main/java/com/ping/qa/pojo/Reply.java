package com.ping.qa.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author: zhangsp
 * @date: 2019/3/19 20:47
 * @copyright: @2019
 */
@Entity
@Table(name = "tb_reply")
@Data
public class Reply {

    @Id
    private String id;
    /**
     * 问题ID
     */
    private String problemid;
    /**
     * 回答内容
     */
    private String content;
    /**
     * 创建日期
     */
    private java.util.Date createtime;
    /**
     * 更新日期
     */
    private java.util.Date updatetime;
    /**
     * 回答人ID
     */
    private String userid;
    /**
     * 回答人昵称
     */
    private String nickname;
}
