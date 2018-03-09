package org.wangguang.service;

import org.wangguang.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2017/8/16.
 */
public interface UserService {

    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);

    User findById(Integer id);
}
