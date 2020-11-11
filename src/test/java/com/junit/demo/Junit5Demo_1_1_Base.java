package com.junit.demo;
import com.util.Calculator;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.sql.PreparedStatement;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 *基础脚本，加减乘除，计数器操作，并打印了结果
 *
 *
 *
 */

public class Junit5Demo_1_1_Base {
    @Test
    public void addTest() {
        int result = Calculator.add(4, 2);
        System.out.println(result);
    }

    @Test
    public void subTractTest(){
        int result = Calculator.subtract(4, 2);
        System.out.println(result);
    }
    @Test
    public void multiplyTest(){
        int result = Calculator.multiply(4, 2);
        System.out.println(result);
    }
    @Test
    public void divideTest(){
        int result = Calculator.divide(4, 2);
        System.out.println(result);
    }

    @Test
    public void countTest() throws InterruptedException{
        int result =Calculator.count(1);
//        result = Calculator.count(1);
//        result = Calculator.count(1);
//        result = Calculator.count(1);
        System.out.println(result);

    }
}
