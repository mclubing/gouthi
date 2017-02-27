package com.gouthi.biz.service.impl;

import com.gouthi.biz.service.UserService;
import com.gouthi.dao.UserDao;
import com.gouthi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Lu.Bing on 2017/2/28.
 * in com.gouthi.biz.service.impl
 * by Lu.Bing
 * on 2017/2/28
 */
@Service("userService")
@Transactional(readOnly=true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
