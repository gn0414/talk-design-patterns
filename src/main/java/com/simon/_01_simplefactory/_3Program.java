package com.simon._01_simplefactory;

import java.util.Scanner;


/**
 * @author Simon
 *我们现在已经成功地将我们的业务逻辑和界面分离开了
 * 也就是我们只需要调用Opertion类里面的方法就可以
 * 实现逻辑,现在好像挺好的,有复用性了，但是还是有问题
 * 我如果想要添加我的Operation里面的新功能，那么是
 * 不是需要拿到Operation的源代码然后去修改，但是
 * 保不准我们会不小心修改到之前写好的业务代码，这就
 * 非常灾难了，所以我们的可维护性太弱了，我们需要想
 * 一个法子来隔离开实现我不同操作实现，那自然就有了
 * 新的想法
 */
public class _3Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.nextLine();
        String opr = scanner.nextLine();
        String num2 = scanner.nextLine();

        String result = null;
        try {
            _3Operation.getResult(num1,opr,num2);
            System.out.println("结果是:" + result);
        } catch (Exception e) {
            System.out.println("对不起你输入的除数为0" + e.getMessage());
        }
    }
}
