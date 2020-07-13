package com.howieLuk.DesignMode.Operation;

public class Div implements Operation {

    @Override
    public double operate(int x, int y) {
        return x / y;
    }

    @Override
    public double operate(float x, float y) {
        return x / y;
    }

    @Override
    public double operate(double x, double y) {
        return x / y;
    }
}
