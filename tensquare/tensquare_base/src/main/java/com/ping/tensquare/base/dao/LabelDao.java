package com.ping.tensquare.base.dao;

import com.ping.tensquare.base.pojo.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 *
 * 标签数据访问接口
 *
 * @author: zhangsp
 * @date: 2019/3/16 15:26
 * @copyright: @2019
 */

public interface LabelDao extends JpaRepository<Label, String>, JpaSpecificationExecutor<Label> {

}
