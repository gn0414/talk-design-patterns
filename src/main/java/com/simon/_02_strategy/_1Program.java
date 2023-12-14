package com.simon._02_strategy;


import java.util.Scanner;

/**
 * @author Simon
 * “小菜，给你出个作业，做一个商场收银软件，营业员根据客户所购买商品的单价和
 * 数量，向客户收费。”
 * “就这个？没问题呀。”小菜说，“用两个文本框来输入单价和数量，一个确定按钮来
 * 算出每种商品的费用，用个列表框来记录商品的清单，一个标签来记录总计，对，还需要
 * 一个重置按钮来重新开始，不就行了？！”
 * 我们得到了超市收银的这个需求一看好像还蛮简单的
 * 那么如果我想打8折呢
 * 那多简单 * 0.8即可
 * 但是我打折策略很多啊
 * 我不定时会采用不同的策略啊,第二个版本就出来了
 * 我们采用我们刚学的简单工厂来试试
 */
public class _1Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String price = scanner.nextLine();
        String num = scanner.nextLine();
        System.out.println("合计为："+String.valueOf(Double.parseDouble(num)*Double.parseDouble(price)));
    }
}
