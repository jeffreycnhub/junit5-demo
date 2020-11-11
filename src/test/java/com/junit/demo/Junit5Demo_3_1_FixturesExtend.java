package com.junit.demo;

import org.junit.jupiter.api.*;


public class Junit5Demo_3_1_FixturesExtend extends Junit5Demo_3_1_Fixtures  {

    @BeforeAll
    public static void beforeChildAll(){
        System.out.println("Child beforeAll 执行");
    }

    @AfterAll
    public static void afterChildAll(){
        System.out.println("Child afterAll 执行");
    }

    @BeforeEach
    public  void beforeChildEach(){
        System.out.println("Child beforeChildEach 执行");
    }
    @AfterEach
    public  void afterChildEach(){
        System.out.println("Child afterChildEach 执行");
    }


    @Test
    public void testChildMethod01() {
        System.out.println("Child testMethod01 执行！");
    }
    @Test
    public void testChildMethod02() {
        System.out.println("Child testMethod02 执行！");
    }
    @Test
    public void testChildMethod03() {
        System.out.println("Child testMethod03 执行！");
    }
}
