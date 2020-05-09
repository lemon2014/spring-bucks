package org.lemon.springbucks.goods.common.handler;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 *
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年03月14日 14:15:00
 */
@Configuration
public class LemonKeyGenerateConfig {
    @Bean(name = "LemonKeyGenerate")
    public KeyGenerator keyGenerator() {
        return (target, method, params) -> method.getName() + "[" + Arrays.asList(params).toString() + "]";
    }
}
