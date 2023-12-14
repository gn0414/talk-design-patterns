package com.simon._01_simplefactory;

public class _4Div implements _4Operation{
    @Override
    public String getResult(String num1, String num2) {
        try {
            return String.valueOf(Double.parseDouble(num1)/Double.parseDouble(num2));
        }catch (Exception e){
            return "除数不能为0";
        }
    }
}
