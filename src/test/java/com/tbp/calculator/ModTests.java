package com.tbp.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ModTests {
    @Test
    @DisplayName("3을 2로 나눈 나머지 테스트")
    public void ModTest() {
        int first = 3;
        int second = 2;

        //when 호출 타이밍
        int result = new Mod().moder(first, second);

        //then (verify) 값의 검증
        Assertions.assertEquals(1, result);
    }
    @Test
    @DisplayName("2147483647을 2로 나눈 나머지 테스트")
    public void ModTest2() {
        int first = 2147483647;
        int second = 2;

        //when 호출 타이밍
        int result = new Mod().moder(first, second);

        //then (verify) 값의 검증
        Assertions.assertEquals(1, result);
    }
}
