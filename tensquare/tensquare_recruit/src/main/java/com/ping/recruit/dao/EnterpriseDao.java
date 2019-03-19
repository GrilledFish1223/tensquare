package com.ping.recruit.dao;

import com.ping.recruit.pojo.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface EnterpriseDao extends JpaRepository<Enterprise, String>, JpaSpecificationExecutor<Enterprise> {
    /**
     * 按是否热门查询企业信息
     *
     * @param ishot
     * @return
     */
    public List<Enterprise> findByIshot(String ishot);
}
