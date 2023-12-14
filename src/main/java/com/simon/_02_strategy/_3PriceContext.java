package com.simon._02_strategy;

public class _3PriceContext {

    private _2SalePrice salePrice;

    public _3PriceContext(_2SalePrice salePrice){
        this.salePrice = salePrice;
    }

    public String getPrice(String money){
        return salePrice.getPrice(money);
    }

}
