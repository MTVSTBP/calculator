package com.tbp.calculator;

public class Divider {

    public double divide(int first, int second) {
        if (second == 0) {
            throw new IllegalArgumentException("ERROR: 제수는 0이 될 수 없습니다.");
        }

        return (double) first / second;
    }
}
