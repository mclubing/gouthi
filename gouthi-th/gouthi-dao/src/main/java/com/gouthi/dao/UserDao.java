package com.gouthi.dao;

import com.gouthi.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Lu.Bing on 2017/2/27.
 * in com.gouthi.prop.com.gouthi.dao
 * by Lu.Bing
 * on 2017/2/27
 */
@Repository
public interface UserDao {
    List<User> findAll();
}
