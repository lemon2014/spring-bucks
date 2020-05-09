package org.lemon.springbucks.user.service;

import org.lemon.springbucks.user.dao.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年03月16日 14:40:00
 */
@Service
public class UserService {

    @Resource
    private UserMapper userMapper;
}
