package com.simon._02_strategy;

/**
 * @author Simon
 *
 * 简单工厂没有问题
 * 倘若我想要加入我们的新的打折策略
 * 我们只需要在我们的工厂里面修改即可
 * 先写一个新的策略实现SalePrice接口
 * 再进行switch添加
 * 完成
 * 但是我们发现如果我们想要增加，那还是会
 * 涉及到修改我们的工厂，每次维护或扩展
 * 收费方式都要改动这个工厂，以致代码需
 * 重新编译部署，下面我将讲解一下策略模式
 */
public class _2Program {
    public static void main(String[] args) {

        _2SalePrice salePrice = _2SalePriceFactory.getSalePrice("0");
        String price = salePrice.getPrice("500");
        System.out.println(price);

        _2SalePrice salePrice1 = _2SalePriceFactory.getSalePrice("1");
        String price1 = salePrice1.getPrice("500");
        System.out.println(price1);

        _2SalePrice salePrice2 = _2SalePriceFactory.getSalePrice("2");
        String price2 = salePrice2.getPrice("500");
        System.out.println(price2);

        //发现可以正常的获得各种
    }
}
