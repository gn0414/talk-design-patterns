package com.simon._01_simplefactory;

/**
 * @author Simon
 */
public class _3Operation {

    public static String getResult(String num1,String opr,String num2){
        String result = null;
        switch (opr){
            case "+":
                result = String.valueOf(Double.parseDouble(num1)+Double.parseDouble(num2));
                break;
            case "-":
                result = String.valueOf(Double.parseDouble(num1)-Double.parseDouble(num2));
                break;
            case "*":
                result = String.valueOf(Double.parseDouble(num1)*Double.parseDouble(num2));
                break;
            case "/":
                result = String.valueOf(Double.parseDouble(num1)/Double.parseDouble(num2));
                break;
            default:
                System.out.println("对不起你输入的操作有误!");
        }
        return result;
    }
}
