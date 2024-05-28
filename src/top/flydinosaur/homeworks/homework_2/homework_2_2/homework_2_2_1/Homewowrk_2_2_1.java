package top.flydinosaur.homeworks.homework_2.homework_2_2.homework_2_2_1;

import java.util.Scanner;

public class Homewowrk_2_2_1 {
    public static double sumColumn(double[][] m, int columnIndex) {

        double sum = 0;

        for (int i = 0; i < 3; i++){
            sum += m[i][columnIndex];
        }

        return sum;
    }
    public static void main(String[] args) {

        double[][] arr = new double[3][4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = scanner.nextDouble();
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("第" + i + "列元素的和为" + sumColumn(arr, i));
        }


    }

}
