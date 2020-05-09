package org.lemon.springbucks.order.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.money.Money;

import java.io.Serializable;
import java.util.Date;

/**
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年03月12日 14:54:00
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Coffee implements Serializable {

    private Long id;
    private String name;
    private Date createTime;
    private Money price;
    private Integer stock;
    private Date updateTime;
}
