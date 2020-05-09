package org.lemon.springbucks.order.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.money.Money;

import java.util.Date;
import java.util.List;

/**
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年03月16日 14:24:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("t_order")
public class Order {
    private Long orderId;
    private Date createTime;
    private Long userId;
    private String nickname;
    private Money orderPrice;
    private Integer payType;
    private Integer orderStatus;
    private Date updateTime;
    private List<String> coffeeIdList;
}
