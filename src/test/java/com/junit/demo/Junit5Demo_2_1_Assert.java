package com.junit.demo;

import com.util.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 主要使用assertEquals方法
 *
 * **/

public class Junit5Demo_2_1_Assert {
    @Test
    public void addTest() {
        int result = Calculator.add(4, 2);
        System.out.println(result);
        assertEquals(5,result);

    }

    @Test
    public void subTractTest() {
        int result = Calculator.subtract(4, 2);
        System.out.println(result);
        assertEquals(2, result);
    }

    @Test
    public void multiplyTest() {
        int result = Calculator.multiply(4, 2);
        System.out.println(result);
        assertEquals(8, result);
    }

    @Test
    public void divideTest() {
        int result = Calculator.divide(4, 2);
        System.out.println(result);
        assertEquals(2, result);
    }

    //主要是为了做清零工作
    @Test
    public void clear() {
        Calculator.clear();
    }

    @Test
    public void countTest() throws InterruptedException {
        int result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        System.out.println(result);

    }
}
