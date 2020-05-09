package org.lemon.springbucks.goods;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年03月22日 00:48:00
 */
@Configuration
@ComponentScan(basePackages = {"org.lemon.springbucks.goods"})
public class MainConfig {

    @Bean(initMethod = "initPerson")
    public Person person(){
        Person person = new Person();
        person.setName("张三");
        person.setSex("男");
        return person;
    }

}
