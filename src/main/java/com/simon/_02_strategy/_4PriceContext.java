package com.simon._02_strategy;


public class _4PriceContext {
    private _2SalePrice salePrice;

    public _4PriceContext(String text){
        switch (text){
            case "0": salePrice = new _2NormalPrice();
            break;
            case "1": salePrice = new _2DivPrice("0.8");
            break;
            case "2": salePrice = new _2SubPrice("300","150");
            break;
            default: salePrice = null;
        }
    }

    public String getPrice(String money){
        return salePrice.getPrice(money);
    }


}
