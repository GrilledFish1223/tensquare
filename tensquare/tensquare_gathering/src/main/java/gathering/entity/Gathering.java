package gathering.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author: zhangsp
 * @date: 2019/3/20 10:18
 * @copyright: @2019
 */
@Entity
@Table(name = "tb_gathering")
@Data
public class Gathering implements Serializable {

    private static final long serialVersionUID = 3560315183287348528L;

    @Id
    private String id;

    /**
     * 活动名称
     */
    private String name;

    /**
     * 大会简介
     */
    private String summary;
    /**
     * 详细说明
     */
    private String detail;
    /**
     * 主办方
     */
    private String sponsor;
    /**
     * 活动图片
     */
    private String image;
    /**
     * 开始时间
     */
    private java.util.Date starttime;
    /**
     * 截止时间
     */
    private java.util.Date endtime;
    /**
     * 举办地点
     */
    private String address;
    /**
     * 报名截止
     */
    private java.util.Date enrolltime;
    /**
     * 是否可见
     */
    private String state;
    /**
     * 城市
     */
    private String city;
}
