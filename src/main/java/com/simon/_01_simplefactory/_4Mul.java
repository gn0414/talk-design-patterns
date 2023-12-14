package com.simon._01_simplefactory;

public class _4Mul implements _4Operation{
    @Override
    public String getResult(String num1, String num2) {
        return String.valueOf(Double.parseDouble(num1)*Double.parseDouble(num2));
    }
}
