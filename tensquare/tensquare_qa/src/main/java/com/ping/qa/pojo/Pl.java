package com.ping.qa.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author: zhangsp
 * @date: 2019/3/19 20:40
 * @copyright: @2019
 */
@Entity
@Table(name = "tb_pl")
@Data
public class Pl implements Serializable {
    /**
     * 问题ID
     */
    @Id
    private String problemid;

    /**
     * 标签ID
     */
    @Id
    private String labelid;

}
