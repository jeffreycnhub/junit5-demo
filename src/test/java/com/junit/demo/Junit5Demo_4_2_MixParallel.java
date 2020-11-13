package com.junit.demo;

import com.util.Calculator;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Junit5Demo_4_2_MixParallel {
    @RepeatedTest(10)
    public  void addTest(){
        int result= Calculator.add(4,2);
        System.out.println(result);
        assertEquals(6,result);
    }
    @RepeatedTest(10)
    public  void subTractTest(){
        int result= Calculator.subtract(4,2);
        System.out.println(result);
        assertEquals(2,result);
    }

    @RepeatedTest(10)
    public  void multiplyTest(){
        int result= Calculator.multiply(4,2);
        System.out.println(result);
        assertEquals(8,result);
    }

}
