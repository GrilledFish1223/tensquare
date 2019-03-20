package com.ping.tensquare.spit.service;

import com.ping.common.util.IdWorker;
import com.ping.tensquare.spit.dao.SpitDao;
import com.ping.tensquare.spit.pojo.Spit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author: zhangsp
 * @date: 2019/3/20 19:30
 * @copyright: @2019
 */
@Service
public class SpitService {
    @Autowired
    private SpitDao spitDao;

    @Autowired
    private IdWorker idWorker;

    @Autowired
    private MongoTemplate mongoTemplate;

    /**
     * 查询全部记录
     *
     * @return
     */
    public List<Spit> findAll() {
        return spitDao.findAll();
    }

    /**
     * 根据主键查询实体
     *
     * @param id
     * @return
     */
    public Spit findById(String id) {
        return spitDao.findById(id).get();
    }

    /**
     * 增加
     *
     * @param spit
     */
    public void add(Spit spit) {
        spit.set_id(idWorker.nextId() + "");
        //发布日期
        spit.setPublishtime(new Date());
        //浏览量
        spit.setVisits(0);
        //分享数
        spit.setShare(0);
        //点赞数
        spit.setThumbup(0);
        //回复数
        spit.setComment(0);
        //状态
        spit.setState("1");
        //如果存在上级ID， 评论
        if (spit.getParentid() != null && !"".equals(spit.getParentid())) {
            Query query = new Query();
            query.addCriteria(Criteria.where("_id").is(spit.getParentid()));
            Update update = new Update();
            update.inc("comment", 1);
            mongoTemplate.updateFirst(query, update, "spit");
        }
        spitDao.save(spit);
    }

    /**
     * 修改
     *
     * @param spit
     */
    public void update(Spit spit) {
        spitDao.save(spit);
    }

    /**
     * 删除
     *
     * @param id
     */
    public void deleteById(String id) {
        spitDao.deleteById(id);
    }

    public Page<Spit> findByParentid(String parentid, int page, int size) {
        PageRequest pageRequest = PageRequest.of(page - 1, size);
        return spitDao.findByParentid(parentid, pageRequest);
    }

    /**
     * 点赞, 为了提高效率采用MongoDB
     * <p>
     * Spit spit = spitDao.findById(id).get();
     * spit.setThumbup(spit.getThumbup()+1);
     *
     * @param id
     */
    public void updateThumbup(String id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(id));
        Update update = new Update();
        update.inc("thumbup", 1);
        mongoTemplate.updateFirst(query, update, "spit");
    }


}
