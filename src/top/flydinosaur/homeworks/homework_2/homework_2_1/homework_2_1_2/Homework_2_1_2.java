package top.flydinosaur.homeworks.homework_2.homework_2_1.homework_2_1_2;

import java.util.Scanner;

public class Homework_2_1_2 {

    public static void printGrade(int grade) {

        if (grade <= 100 & grade >= 90) {
            System.out.println("A");
        } else if (grade <= 89 & grade >= 80) {
            System.out.println("B");
        } else if (grade <= 79 & grade >= 70) {
            System.out.println("C");
        } else if (grade <= 69 & grade >= 60) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }

    }
    public static void main(String[] args) {
        int score = 0;
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();
        printGrade(score);
    }
}