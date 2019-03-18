package com.ping.tensquare.base.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 标签实体类
 *
 * @author: zhangsp
 * @date: 2019/3/16 15:19
 * @copyright: @2019
 */
@Entity
@Table(name = "tb_label")
@Data
public class Label {
    /**
     * id
     */
    @Id
    private String id;

    /**
     * 标签名称
     */
    private String labelname;

    /**
     * 状态
     */
    private String state;

    /**
     * 使用数量
     */
    private Long count;

    /**
     * 关注数量
     */
    private Long fans;

    /**
     * 是否推荐
     */
    private String recommend;

}
