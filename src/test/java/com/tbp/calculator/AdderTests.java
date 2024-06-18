package com.tbp.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AdderTests {
    @Test
    @DisplayName("1과 2를 더한 결과가 3인지 확인")
    public void testAdd1() {
        //given
        int a = 1;
        int b = 2;

        //when
        int result = new Adder().add(a,b);
        //then (verify)
        Assertions.assertEquals(5,result);
    }

    @Test
    @DisplayName("2과 3을 더한 결과가 5인지 확인")
    public void testAdd2() {
        //given
        int a = 2;
        int b = 3;

        //when
        int result = new Adder().add(a,b);
        //then (verify)
        Assertions.assertEquals(5,result);
    }
}