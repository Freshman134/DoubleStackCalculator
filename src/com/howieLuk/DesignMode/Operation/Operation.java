package com.howieLuk.DesignMode.Operation;

/**
 * 算数运算符接口
 */
public interface Operation {

    /**
     * 整数计算
     */
    double operate(int x, int y);

    /**
     * 单精度浮点数计算
     */
    double operate(float x, float y);

    /**
     * 双精度浮点数计算
     */
    double operate(double x, double y);
}
