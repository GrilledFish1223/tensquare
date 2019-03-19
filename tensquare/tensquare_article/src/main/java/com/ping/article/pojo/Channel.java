package com.ping.article.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author: zhangsp
 * @date: 2019/3/19 21:23
 * @copyright: @2019
 */
@Entity
@Table(name="tb_channel")
@Data
public class Channel {
    /**
     * ID
     */
    @Id
    private String id;
    /**
     * 频道名称
     */
    private String name;
    /**
     * 状态
     */
    private String state;
}
