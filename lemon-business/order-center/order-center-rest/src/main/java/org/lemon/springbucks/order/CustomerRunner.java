package org.lemon.springbucks.order;

import org.lemon.springbucks.order.request.Coffee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年03月16日 15:38:00
 */
@Component
public class CustomerRunner implements ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(CustomerRunner.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Override
    public void run(ApplicationArguments args) {
        showServiceInstances();
        queryCoffeeById(1230L);
        queryCoffeeById(1230L);
    }

    private void showServiceInstances() {
        logger.info("DiscoveryClient: {}", discoveryClient.getClass().getName());
        discoveryClient.getInstances("goods-center").forEach(s -> {
            logger.info("Host: {}, Port: {}", s.getHost(), s.getPort());
        });
    }

    /**
     * 这里测试直接使用restTemplate来调用接口
     *
     * @param id
     */
    private void queryCoffeeById(Long id) {
        Coffee coffee = restTemplate.getForObject("http://goods-center/goods/coffee/{id}", Coffee.class, id);
        logger.info("coffee: {}", coffee);
    }
}
