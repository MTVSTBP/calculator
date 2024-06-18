package com.tbp.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MinusTests {
    @Test
    @DisplayName("3과 1를 뺀 결과값 확인")
    public void minusTest() {
        int first = 3;
        int second = 1;

        int result = new Minus().minus(3,1);

        Assertions.assertEquals(2, result);
    }

}
