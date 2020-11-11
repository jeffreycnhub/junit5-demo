package com.junit.demo;


import com.util.Calculator;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

public class Junit5Demo_4_1_Parallel {
    @RepeatedTest(10)
    @Execution(ExecutionMode.CONCURRENT)
    public void contTest() throws InterruptedException{
        int result = Calculator.count(1);
        System.out.println(result);
    }
    @RepeatedTest(10)
    public void countSynTest() throws InterruptedException{
        int result = Calculator.count(1);
        System.out.println(result);
    }

}
