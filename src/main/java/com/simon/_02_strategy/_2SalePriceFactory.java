package com.simon._02_strategy;

/**
 * @author Simon
 */
public class _2SalePriceFactory {

    public static _2SalePrice getSalePrice(String text){
        switch (text){
            case "0":return new _2NormalPrice();
            case "1":return new _2DivPrice("0.8");//打八折
            case "2":return new _2SubPrice("300","100");
            default: return null;
        }
    }

}
