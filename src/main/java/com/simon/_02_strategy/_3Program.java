package com.simon._02_strategy;

/**
 * @author Simon
 * 策略模式
 * 我们的策略模式中
 * 有一个称为上下文的一个类
 * 它的对象会包含一个策略接口就是我们上面
 * 写的那个SalePrice接口
 * 这样我们假如说传进去我们的SalePrice实现类
 * 我们就可以实现对应的功能
 * 但是这个又回到了我们说的一个问题，我们在界面
 * 里面写了我们的业务逻辑，选择策略的逻辑，那么我
 * 么如果使用简单工厂一起使用会是什么结果呢
 */
public class _3Program {
    public static void main(String[] args) {
        _3PriceContext priceContext = new _3PriceContext(new _2NormalPrice());
        System.out.println(priceContext.getPrice("500"));

        _3PriceContext priceContext1 = new _3PriceContext(new _2DivPrice("0.7"));
        System.out.println(priceContext1.getPrice("500"));

        _3PriceContext priceContext2 = new _3PriceContext(new _2SubPrice("300","200"));
        System.out.println(priceContext2.getPrice("500"));
    }
}
