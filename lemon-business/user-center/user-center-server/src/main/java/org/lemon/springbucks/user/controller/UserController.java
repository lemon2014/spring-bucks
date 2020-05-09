package org.lemon.springbucks.user.controller;

import org.lemon.springbucks.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年03月16日 14:43:00
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;
}
