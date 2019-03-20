package com.ping.article.pojo;

import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * 文章评论（mongoDB）
 *
 * @author: zhangsp
 * @date: 2019/3/20 20:17
 * @copyright: @2019
 */
@Data
public class Comment implements Serializable {
    private static final long serialVersionUID = 426126303949162106L;

    @Id
    private String _id;
    private String articleid;
    private String content;
    private String userid;
    private String parentid;
    private Date publishdate;
}
