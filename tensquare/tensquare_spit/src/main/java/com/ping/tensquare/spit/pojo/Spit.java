package com.ping.tensquare.spit.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: zhangsp
 * @date: 2019/3/20 19:27
 * @copyright: @2019
 */
@Data
public class Spit implements Serializable {
    private static final long serialVersionUID = 1157184303922327480L;

    @Id
    private String _id;
    private String content;
    private Date publishtime;
    private String userid;
    private String nickname;
    private Integer visits;
    private Integer thumbup;
    private Integer share;
    private Integer comment;
    private String state;
    private String parentid;
}
