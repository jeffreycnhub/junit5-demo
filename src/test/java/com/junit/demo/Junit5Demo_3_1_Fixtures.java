package com.junit.demo;

import org.junit.jupiter.api.*;

/**
 *
 * "@BeforeEach": 在运行类测试时，每个方法执行前都会执行一次此注解修饰的方法；
 * "@BeforeAll": 在运行类测试时，每个方法执行前都会执行一次此注解修饰的方法；
 *
 *
 *
 * */

public class Junit5Demo_3_1_Fixtures {
    @BeforeAll
    public static void beforeAll(){
        System.out.println("beforeAll 执行！");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("afterAll 执行！");
    }

    @BeforeEach
    public  void beforeEach(){
        System.out.println("beforeEach 执行！");
    }
    @AfterEach
    public  void afterEach(){
        System.out.println("beforeAll 执行！");
    }

    @Test
    public void testMethod01(){
        System.out.println("testMethod01 执行");
    }
    @Test
    public void testMethod02(){
        System.out.println("testMethod02 执行");
    }
    @Test
    public void testMethod03(){
        System.out.println("testMethod03 执行");
    }

}
