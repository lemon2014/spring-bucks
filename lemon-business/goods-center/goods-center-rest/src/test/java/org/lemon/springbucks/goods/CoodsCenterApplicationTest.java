package org.lemon.springbucks.goods;

import lombok.extern.slf4j.Slf4j;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lemon.springbucks.goods.entity.Coffee;
import org.lemon.springbucks.goods.service.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年03月14日 10:44:00
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class CoodsCenterApplicationTest {

    @Autowired
    private CoffeeService coffeeService;

    @Test
    public void testInsert() {
        List<String> list = new ArrayList<>();
        list.add("卡布奇诺");
        list.add("焦糖拿铁");
        list.add("黑糖玛奇朵");
        list.add("摩卡");
        list.add("维也纳");
        list.add("美式");

        list.forEach(t-> {
            Random random = new Random();
            Coffee coffee = Coffee.builder()
                    .name(t)
                    .price(Money.of(CurrencyUnit.of("CNY"), random.nextInt(100)))
                    .createTime(new Date())
                    .build();
            int id = coffeeService.insertCoffee(coffee);
            log.info("coffee {} => {}", id, coffee);
        });
    }


    /**
     *  咖啡的价格一天都不会变, 缓存所有价格, 一天失效一次？
     *
     *  根据名称缓存, 美式咖啡每次都要实时查询
     *
     *  手动清空缓存
     *
     *
     *
     */
    @Test
    public void testFindById() {
        Coffee coffee = coffeeService.findById(1224L);
        log.info("第一次查询：", coffee.toString());

        coffee = coffeeService.findById(1224L);
        log.info("第二次查询：", coffee.toString());
    }

    @Test
    public void testSelectList() {

    }
}
