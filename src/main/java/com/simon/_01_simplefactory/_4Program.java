package com.simon._01_simplefactory;

import java.util.Scanner;

/**
 * @author Simon
 * 我们可以将我们的计算逻辑抽象成一个操作接口,不同操作
 * 有对应的实现,这样我们在添加新的计算方式时，我们只需
 * 要继承Opertaion接口然后书写计算方法即可，但是我们
 * 如果这样写不还是要在我们的界面写逻辑来选是哪一个实现？
 *
 * 其实不用，我们说过封装将业务逻辑和界面分离开，我们
 * 就此引入简单工厂模式，我们只需要将选择的逻辑放入我们
 * 的工厂即可(这就是我们简单工厂)
 */
public class _4Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.nextLine();
        String opr = scanner.nextLine();
        String num2 = scanner.nextLine();
        String result = null;


        _4Operation operation = _4OpetionFactory.operation(opr);
        assert operation != null;
        String result1 = operation.getResult(num1, num2);
        System.out.println(result1);

    }
}
