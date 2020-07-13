package com.howieLuk.Algorithm.DoubleStackCalculator;

/**
 * 10以内字符串算数表达式计算，整数计算
 */
public interface Calculator {
    /**
     * 10整数以内字符串算数表达式计算
     * @param express 算数表达式，数值为10以内
     * @return 算数结果
     */
    int calculate(String express);
}
