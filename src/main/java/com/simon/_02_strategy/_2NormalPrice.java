package com.simon._02_strategy;

public class _2NormalPrice implements _2SalePrice {

    @Override
    public String getPrice(String money) {
        return money;
    }
}
