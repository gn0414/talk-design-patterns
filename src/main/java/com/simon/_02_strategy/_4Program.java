package com.simon._02_strategy;
/**
 * @author Simon
 * 简单工厂与策略模式组合
 * 我们在构造的时候进行策略选择
 * 也就是简单工厂的使用,并且通过
 * 策略模式来找到对应实现的对象
 * 后面会补充使用反射的方法
 * 具体详细请看_4PriceContext
 */
public class _4Program {

    public static void main(String[] args) {
        _4PriceContext context = new _4PriceContext("0");
        System.out.println(context.getPrice("500"));

        _4PriceContext context1 = new _4PriceContext("1");
        System.out.println(context1.getPrice("500"));

        _4PriceContext context2 = new _4PriceContext("2");
        System.out.println(context2.getPrice("500"));
    }
}
