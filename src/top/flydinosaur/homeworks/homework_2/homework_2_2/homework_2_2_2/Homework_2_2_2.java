package top.flydinosaur.homeworks.homework_2.homework_2_2.homework_2_2_2;

import java.util.Scanner;

public class Homework_2_2_2 {


    public static int[] generateArray(){

        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        int[] arr = new int[index];
        for (int i = 0; i < index; i++) {
            arr[i] = scanner.nextInt();
        }

        return arr;
    }

    public static int getMax(int[] arr){

        int max = 0;

        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }

        return max;

    }
    public static void main(String[] args) {

        System.out.println("最大数是" + getMax(generateArray()));

    }
}