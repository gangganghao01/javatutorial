
package com.gangganghao.unittest.core.util;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * BigDecimalUtil 单元测试类
 **/
public class BigDecimalUtilTest {

    /**
     * 测试类执行前调用方法（仅调用1次）
     */
    @BeforeClass
    public static void beforeClass() {
        System.out.println("call before class");
    }

    /**
     * 测试类执行后调用方法（仅调用1次）
     */
    @AfterClass
    public static void afterClass() {
        System.out.println("call after class");
    }

    /**
     * 测试方法执行前调用方法
     */
    @Before
    public void beforeMethod() {
        System.out.println("call before method");
    }

    /**
     * 测试方法执行后调用方法
     */
    @After
    public void afterMethod() {
        System.out.println("call after method");
    }

    /**
     * 测试getAddVal方法-正常输入
     */
    @Test
    public void testGetAddValNormal() {
        Assert.assertEquals(0,
                new BigDecimal("15").compareTo(BigDecimalUtil.getAddVal(new BigDecimal("5"), BigDecimal.TEN)));
    }

    /**
     * 测试getAddVal方法-单一null值情况
     */
    @Test
    public void testGetAddValNull() {
        Assert.assertEquals(0,
                BigDecimal.TEN.compareTo(BigDecimalUtil.getAddVal(null, BigDecimal.TEN)));
    }

    /**
     * 测试getAddVal方法-均为null值情况
     */
    @Test
    public void testGetAddValBothNull() {
        Assert.assertEquals(0,
                BigDecimal.ZERO.compareTo(BigDecimalUtil.getAddVal(null, null)));
    }

    /**
     * 测试getDivVal方法-正常输入
     */
    @Test
    public void testGetDivValNormal() {
        int scale = 10;
        BigDecimal result = BigDecimalUtil.getDivVal(BigDecimal.TEN, BigDecimal.ONE, scale, BigDecimal.ROUND_HALF_UP);
        Assert.assertEquals(0, BigDecimal.TEN.compareTo(result));
        Assert.assertEquals(10, result.scale());
    }

    /**
     * 测试getDivVal方法-null值情况
     */
    @Test
    public void testGetDivValNull() {
        int scale = 10;
        BigDecimal result = BigDecimalUtil.getDivVal(BigDecimal.TEN, null, scale, BigDecimal.ROUND_HALF_UP);
        Assert.assertNull(result);
    }

    /**
     * 测试getDivVal方法-0值情况
     */
    @Test
    public void testGetDivValZero() {
        int scale = 10;
        BigDecimal result = BigDecimalUtil.getDivVal(BigDecimal.TEN, BigDecimal.ZERO, scale, BigDecimal.ROUND_HALF_UP);
        Assert.assertNull(result);
    }

    /**
     * 测试getDivVal方法-截取精度情况
     */
    @Test
    public void testGetDivValRoundMode() {
        int scale = 2;
        BigDecimal result = BigDecimalUtil.getDivVal(BigDecimal.TEN, new BigDecimal("3"), scale,
                BigDecimal.ROUND_DOWN);
        Assert.assertEquals(0, new BigDecimal("3.33").compareTo(result));
    }

    /**
     * 测试getDivVal方法-精度异常情况
     */
    @Test(expected = IllegalArgumentException.class)
    public void testGetDivValRoundModeException() {
        int scale = 2;
        BigDecimal result = BigDecimalUtil.getDivVal(BigDecimal.TEN, new BigDecimal("3"), scale, 10);
    }

    /**
     * 忽略方法，当测试方法调整，单测方法需要暂时不执行实可以增加此方法
     */
    @Ignore
    public void testIgnore() {
        System.out.println("testIgnore never call");
    }
}