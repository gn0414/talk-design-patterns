package com.simon._01_simplefactory;

import java.util.Scanner;

/**
 * @author Simon
 *
 * 这一章的问题太明显了
 * 1.我们的命名不规范
 * 2.if多次判断了判断分支写法问题
 * 3.我们假设除数为0就抛出异常了
 */
public class _1Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String opr = scanner.nextLine();
        String b = scanner.nextLine();

        String result = null;

        if (opr.equals("+")){
            result = String.valueOf(Double.parseDouble(a)+Double.parseDouble(b));
        }
        if (opr.equals("-")){
            result = String.valueOf(Double.parseDouble(a)-Double.parseDouble(b));
        }
        if (opr.equals("*")){
            result = String.valueOf(Double.parseDouble(a)*Double.parseDouble(b));
        }
        if (opr.equals("/")){
            result = String.valueOf(Double.parseDouble(a)/Double.parseDouble(b));
        }
        System.out.println("结果是:"+result);
    }
}
