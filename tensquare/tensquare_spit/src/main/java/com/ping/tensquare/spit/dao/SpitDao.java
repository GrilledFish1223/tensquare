package com.ping.tensquare.spit.dao;

import com.ping.tensquare.spit.pojo.Spit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author: zhangsp
 * @date: 2019/3/20 19:29
 * @copyright: @2019
 */

public interface SpitDao extends MongoRepository<Spit, String> {
    /**
     * 根据上级ID查询吐槽
     *
     * @param parentId
     * @param pageable
     * @return
     */
    public Page<Spit> findByParentid(String parentId, Pageable pageable);
}
