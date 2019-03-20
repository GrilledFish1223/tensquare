package com.ping.article.dao;


import com.ping.article.pojo.Channel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 数据访问接口
 *
 * @author Administrator
 */
public interface ChannelDao extends JpaRepository<Channel, String>, JpaSpecificationExecutor<Channel> {

}
