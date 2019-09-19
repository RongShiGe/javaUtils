package com.venus.demo.service.impl;

import com.alibaba.fastjson.JSON;
import com.venus.demo.dao.mapper.UserMapper;
import com.venus.demo.dao.model.User;
import com.venus.demo.dao.model.UserExample;
import com.venus.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户信息
 */
@Service
public class UserServiceImpl implements UserService {

    private final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    /**
     * 查询所有的用户信息
     * @param user 查询对象
     * @return
     */
    @Override
    public List<User> findUserList(User user) {
        UserExample example = new UserExample();
        if (user != null && user.getName() != null){
            example.createCriteria().andNameEqualTo(user.getName());
        }
        List<User> userList = userMapper.selectByExample(example);
        logger.info("findUserList user={}, userList={}", JSON.toJSONString(user), JSON.toJSONString(userList));
        return userList;
    }

    /**
     * 删除表数据
     * @param user 删除条件
     * @return
     */
    @Override
    public int deleteUsrByName(User user) {
        UserExample example = new UserExample();
        if (user != null && user.getName() != null){
            example.createCriteria().andNameEqualTo(user.getName());
        }
        int i = userMapper.deleteByExample(example);
        logger.debug("findUserList user={}, deleteCount={}", JSON.toJSONString(user), i);
        return i;
    }
}
