package com.junit.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvnTest {
    @Test
    public void evnTest(){
        assertEquals(1,3,"实际值与期望值不符合");

    }

}
