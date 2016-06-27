package com.example.testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 猿代码：Lxw
 * 时间：2016/6/27
 * 伊妹儿：china2021@126.com
 */
public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
        /**
         * setUp是测试类中自动添加的方法：
         * 每测试一个方法之前 此方法都会被调用。
         */
        System.out.print("测试之前"+"\n");
    }

    @After
    public void tearDown() throws Exception {
        /**
         * tearDown是测试类中自动添加的方法：
         * 每测试一个方法之后 此方法都会被调用。
         */
        System.out.print("测试之后"+"\n");
    }

    @Test
    public void testSum() throws Exception {
        System.out.print("测试————————Sum"+"\n");
        assertEquals("测试方法的提示",6,calculator.sum(1,4),1);
        /**
         * 参数说明：
         * 参数一： 用于提示的，可选。
         * 参数二： 预期的返回值。
         * 参数三： 实际的返回值。
         * 参数四： 误差值，在误差值之内则是对。在误差值之外则错
         * assert还有各种方法，一般返回值， 对象比较等等。。。
         */
    }

    @Test
    public void testSubstract() throws Exception {
        System.out.print("测试————————Substract"+"\n");
    }

    @Test
    public void testDivide() throws Exception {
        System.out.print("测试————————Divide"+"\n");
    }

    @Test
    public void testMultiply() throws Exception {
        System.out.print("测试————————Multiply"+"\n");
    }
}