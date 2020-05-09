package org.lemon.springbucks.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.money.Money;

import java.util.Date;

/**
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年03月16日 14:32:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("t_user")
public class User {

    private Long userId;
    private String username;
    private String password;
    private String nickname;
    private String phoneNum;
    private Integer userType;
    private Money accountBalance;
    private Date createTime;
    private Date updateTime;
}
