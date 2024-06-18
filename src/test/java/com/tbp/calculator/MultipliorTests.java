package com.tbp.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MultipliorTests {
    @Test
    @DisplayName("1과 2를 곱한 결과가 2인지 확인")
    public void testMul1() {
        //given
        int a = 1;
        int b = 2;

        //when
        int result = new Multiplior().mul(a,b);
        //then (verify)
        Assertions.assertEquals(2,result);
    }

    @Test
    @DisplayName("1과 2를 곱한 결과가 2인지 확인")
    public void testMul2() {
        //given
        int a = 2;
        int b = 3;

        //when
        int result = new Multiplior().mul(a,b);
        //then (verify)
        Assertions.assertEquals(6,result);
    }
}
