package com.simon._01_simplefactory;

import java.util.Scanner;


/**
 * @author Simon
 *
 * 好像通过这个我们程序就没什么问题了
 * 是的，如果是解决这一个问题我们的程序确实没有什么大的问题
 * 但是我们可以发现
 * 我们的计算逻辑暴露在了我们的界面面前
 * 所以我们需要将我们的界面和逻辑分开
 * 这里就是封装的体现了
 * 并且这段计算逻辑我们不仅可以在这里用
 * 假如我其他的地方需要使用这一个逻辑我一样可以调用
 * 就有了可复用性
 */
public class _2Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.nextLine();
        String opr = scanner.nextLine();
        String num2 = scanner.nextLine();

        String result = null;
        try {
            switch (opr){
                case "+":
                    result = String.valueOf(Double.parseDouble(num1)+Double.parseDouble(num2));
                    break;
                case "-":
                    result = String.valueOf(Double.parseDouble(num1)-Double.parseDouble(num2));
                    break;
                case "*":
                    result = String.valueOf(Double.parseDouble(num1)*Double.parseDouble(num2));
                    break;
                case "/":
                    result = String.valueOf(Double.parseDouble(num1)/Double.parseDouble(num2));
                    break;
                default:
                    System.out.println("对不起你输入的操作有误!");
            }


            System.out.println("结果是:"+result);
        }catch (Exception e){
            System.out.println("对不起你输入的除数为0"+e.getMessage());
        }
    }
}
