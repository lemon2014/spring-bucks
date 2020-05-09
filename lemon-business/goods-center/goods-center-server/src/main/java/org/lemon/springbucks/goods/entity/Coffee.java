package org.lemon.springbucks.goods.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
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
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("t_coffee")
public class Coffee implements Serializable {

    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private Date createTime;
    private Money price;
    private Integer stock;
    private Date updateTime;
}
