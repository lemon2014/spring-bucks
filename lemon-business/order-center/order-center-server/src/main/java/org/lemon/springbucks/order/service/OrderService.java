package org.lemon.springbucks.order.service;

import org.lemon.springbucks.order.dao.OrderMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年03月16日 14:30:00
 */
@Service
public class OrderService {
    @Resource
    private OrderMapper orderMapper;


    public void createOrder(){

        /**
         *  1、先查询订单里面的商品是否还有库存
         *  2、生成订单, 并且修改库存信息
         */

    }


}
