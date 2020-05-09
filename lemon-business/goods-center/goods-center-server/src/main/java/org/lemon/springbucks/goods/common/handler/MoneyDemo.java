package org.lemon.springbucks.goods.common.handler;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 常见money相关操作, 将金额*100然后再保存, 避免角和分的丢失
 *
 * @author lemon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2020年03月14日 13:23:00
 */
public class MoneyDemo {
    public static void main(String[] args) {
        Money money20 = Money.of(CurrencyUnit.of("CNY"), 20);
        System.out.println(money20.getAmount());

        BigDecimal bigDecimal = new BigDecimal("10.52625");

        //直接删除超出精度部分
        money20 = money20.multipliedBy(bigDecimal, RoundingMode.DOWN);
        System.out.println(money20.getAmount());
    }
}
