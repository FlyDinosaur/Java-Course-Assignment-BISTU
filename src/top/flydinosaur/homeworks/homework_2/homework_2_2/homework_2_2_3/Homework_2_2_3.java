package top.flydinosaur.homeworks.homework_2.homework_2_2.homework_2_2_3;

import java.util.Scanner;

public class Homework_2_2_3 {

    public static int[] generateArray(){

        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        int arr[] = new int[index];

        for (int i = 0; i < index; i++) {
            arr[i] = scanner.nextInt();
        }

        return arr;
    }

    public static int[] reverse(int[] arr){
        int[] reverseArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reverseArray[i] = arr[arr.length - 1 - i];
        }

        return reverseArray;
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print(arr[arr.length - 1]);
        System.out.print("]");
        System.out.print("\n");
    }

    public static void main(String[] args) {

        int[] temp = generateArray();
        printArray(temp);
        printArray(reverse(temp));
    }
}