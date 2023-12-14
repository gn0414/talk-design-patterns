package com.simon._01_simplefactory;



/**
 * @author Simon
 * 我们将选择的逻辑直接放入我们的工厂里面
 * 我们工厂只生产我们的操作对象（在工厂中判断）
 */
public class _4OpetionFactory {

    public static _4Operation operation(String opr){
        switch (opr){
            case "+":
                return new _4Add();
            case "-":
                return new _4Sub();
            case "*":
                return new _4Mul();
            case "/":
                return new _4Div();
            default:
                return null;
        }
    }

}
