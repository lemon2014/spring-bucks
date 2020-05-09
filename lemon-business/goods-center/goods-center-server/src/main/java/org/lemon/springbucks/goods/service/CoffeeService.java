package org.lemon.springbucks.goods.service;

import org.lemon.springbucks.goods.dao.CoffeeMapper;
import org.lemon.springbucks.goods.entity.Coffee;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年03月12日 16:22:00
 */
@Service
public class CoffeeService {

    @Resource
    private CoffeeMapper coffeeMapper;

    /**
     * 通过ID查找用户
     *
     * @param id
     * @return
     */
    public Coffee findById(Long id) {
        return coffeeMapper.selectById(id);
    }

    /**
     * 插入的时候把id做为key存储
     *
     * @param coffee
     * @return
     */
    public int insertCoffee(Coffee coffee) {
        return coffeeMapper.insert(coffee);
    }

}

