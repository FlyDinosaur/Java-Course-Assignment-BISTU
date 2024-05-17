package top.flydinosaur.homeworks.homework_1;

//编写程序，计算矩形的面积和周长。
//要求从键盘输入矩形的长和宽，类型为double。

import java.util.Scanner;

public class Homework_1 {
    public static void main(String[] args) {
        double width, heigh, c, s;
        Scanner input = new Scanner(System.in);
        width = input.nextDouble();
        heigh = input.nextDouble();

        c = width * 2 + heigh * 2;
        s = width * heigh;

        System.out.println("周长是" + c);
        System.out.println("面积是" + s);

    }
}
