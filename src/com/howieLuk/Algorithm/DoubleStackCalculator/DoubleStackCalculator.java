package com.howieLuk.Algorithm.DoubleStackCalculator;

import java.util.Stack;

/**
 * 双栈算术表达式计算器
 */
public class DoubleStackCalculator implements Calculator {

    private Stack<Integer> leftStack;
    private Stack<Integer> rightStack;

    public DoubleStackCalculator() {
        leftStack = new Stack<>();
        rightStack = new Stack<>();
    }

    @Override
    public int calculate(String express) {

        return 0;
    }
}
