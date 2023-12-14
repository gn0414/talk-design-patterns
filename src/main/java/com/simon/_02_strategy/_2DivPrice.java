package com.simon._02_strategy;

public class _2DivPrice implements _2SalePrice{

    private String sale;

    public _2DivPrice(String sale){
        this.sale = sale;
    }
    @Override
    public String getPrice(String money) {
        return String.valueOf(Double.parseDouble(money) * Double.parseDouble(sale));
    }
}
