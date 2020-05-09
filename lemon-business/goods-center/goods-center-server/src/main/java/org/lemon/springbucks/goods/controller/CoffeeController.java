package org.lemon.springbucks.goods.controller;

import org.lemon.springbucks.goods.entity.Coffee;
import org.lemon.springbucks.goods.service.CoffeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年03月16日 14:41:00
 */
@RestController
public class CoffeeController {

    private Logger logger = LoggerFactory.getLogger(CoffeeController.class);

    @Autowired
    private CoffeeService coffeeService;

    @Autowired
    Environment environment;

    /**
     * Gets coffee.
     *
     * @param id the id
     * @return the coffee
     */
    @GetMapping("/goods/coffee/{id}")
    public Coffee getCoffee(@PathVariable("id") Long id) {
        logger.info("端口号:" + environment.getProperty("local.server.port"));
        return coffeeService.findById(id);
    }
}
