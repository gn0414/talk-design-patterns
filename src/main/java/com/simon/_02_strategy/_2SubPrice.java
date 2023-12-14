package com.simon._02_strategy;

public class _2SubPrice implements _2SalePrice{


    private String moneyLevel;

    private String subMoney;

    public _2SubPrice(String moneyLevel,String subMoney){
        this.subMoney = subMoney;
        this.moneyLevel = moneyLevel;
    }

    @Override
    public String getPrice(String money) {
        Double mo = Double.parseDouble(money);

        Double su = Double.parseDouble(subMoney);

        Double ml = Double.parseDouble(moneyLevel);

        if (su > ml) {
            return "你输入有误";
        }
        if (mo > ml){
            mo =  mo - (int)(mo/ml)* su;
        }
        return String.valueOf(mo);
    }
}
