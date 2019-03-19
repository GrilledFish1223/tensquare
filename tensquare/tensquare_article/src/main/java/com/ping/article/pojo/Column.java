package com.ping.article.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author: zhangsp
 * @date: 2019/3/19 21:24
 * @copyright: @2019
 */
@Entity
@Table(name="tb_column")
@Data
public class Column {
    /**
     * ID
     */
    @Id
    private String id;
    /**
     * 专栏名称
     */
    private String name;
    /**
     * 专栏简介
     */
    private String summary;
    /**
     * 用户ID
     */
    private String userid;
    /**
     * 申请日期
     */
    private java.util.Date createtime;

    /**
     * 审核日期
     */
    private java.util.Date checktime;
    /**
     * 状态
     */
    private String state;
}
