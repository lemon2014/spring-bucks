package org.lemon.springbucks.order.controller;

import org.lemon.springbucks.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年03月16日 14:45:00
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;


    
}
