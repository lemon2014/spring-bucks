package org.lemon.springbucks.goods;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年03月22日 00:46:00
 */
public class ConfigureClass {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = (Person) ctx.getBean("person");
        System.out.println(person.getName());
    }
}
