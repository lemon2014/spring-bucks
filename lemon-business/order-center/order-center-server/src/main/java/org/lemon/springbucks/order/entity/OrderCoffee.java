package org.lemon.springbucks.order.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年03月16日 14:53:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("t_order_coffee")
public class OrderCoffee {
    private Long id;
    private Long orderId;
    private Long coffeeid;
}
