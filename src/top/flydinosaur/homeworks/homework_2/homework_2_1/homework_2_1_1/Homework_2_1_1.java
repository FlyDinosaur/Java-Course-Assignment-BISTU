package top.flydinosaur.homeworks.homework_2.homework_2_1.homework_2_1_1;

//从键盘输入5个整数，求和并输出结果。提示：使用循环读取5个int类型的数据。

import java.util.Scanner;

public class Homework_2_1_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += scanner.nextInt();
        }
        System.out.println("5个数的和是：" + sum);
    }

}

