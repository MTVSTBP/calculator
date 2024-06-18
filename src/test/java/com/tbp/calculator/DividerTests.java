package com.tbp.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DividerTests {

    @Test
    @DisplayName("10과 2를 나눈 결과가 5인지 확인")
    public void testDivide() {
        // given
        int first = 10;
        int second = 2;

        // when
        int result = (int) new Divider().divide(first, second);

        // then
        Assertions.assertEquals(5, result);
    }

    @Test
    @DisplayName("제수가 0인 경우 IllegalArgumentException 예외 처리 발생")
    public void testDivide2() {
        int first = 10;
        int second = 0;

        try {
            System.out.println((int) new Divider().divide(first, second));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
