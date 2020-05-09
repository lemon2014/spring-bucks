package org.lemon.springbucks.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * 商品中心启动类
 *
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年03月12日 11:01:00
 */
@MapperScan("org.lemon.springbucks.goods.dao")
@ComponentScan(basePackages = {"org.lemon.springbucks.goods"})
@SpringBootApplication
@EnableCaching
@EnableDiscoveryClient
@EnableFeignClients
public class GoodsCenterApplication {

    private Logger logger = LoggerFactory.getLogger(GoodsCenterApplication.class);

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(GoodsCenterApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            
        };
    }
}
