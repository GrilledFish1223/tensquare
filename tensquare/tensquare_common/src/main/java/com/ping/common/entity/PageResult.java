package com.ping.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @author: zhangsp
 * @date: 2019/3/16 14:50
 * @copyright: @2019
 */
@Data
@AllArgsConstructor
public class PageResult<T> {
    /**
     * 总数
     */
    private Long total;

    /**
     * 行数
     */
    private List<T> rows;


}
