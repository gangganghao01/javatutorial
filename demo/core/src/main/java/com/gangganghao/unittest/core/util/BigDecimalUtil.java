
package com.gangganghao.unittest.core.util;

import java.math.BigDecimal;

/**
 * BigDecimal工具类
 **/
public class BigDecimalUtil {

    /**
     * 计算BigDecimal求和
     *
     * @param a BigDecimal
     * @param b BigDecimal
     *
     * @return 如果两个值都是null则返回0，如果其中之一为null，则返回不为null的值，否则返回两者加和
     */
    public static BigDecimal getAddVal(BigDecimal a, BigDecimal b) {
        if (null == a && null == b) {
            return BigDecimal.ZERO;
        } else if (null == a) {
            return b;
        } else if (null == b) {
            return a;
        }
        return a.add(b);
    }

    /**
     * 计算BigDecimal相除
     *
     * @param a
     * @param b
     * @param scale
     * @param round
     *
     * @return
     */
    public static BigDecimal getDivVal(BigDecimal a, BigDecimal b, int scale,int round) {
        if (null == a || null == b || BigDecimal.ZERO.compareTo(b) == 0) {
            return null;
        }
        return a.divide(b, scale, round);
    }

}
