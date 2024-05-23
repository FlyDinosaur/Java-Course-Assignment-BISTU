package top.flydinosaur.homeworks.homework_11.homework_11_1;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_11_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Student[] student = new Student[3];

        for (int i = 0; i < 3; i++) {
            student[i] = new Student(scanner.next(), scanner.nextInt());
        }

        Arrays.sort(student);

        for (int i = 0; i < 3; i++) {
            System.out.println(student[i].toString());
        }

    }

}

class Student implements Comparable<Student> {

    private String name;
    private int score;

    @Override
    public int compareTo(Student student) {
        return Integer.compare(this.score, student.score);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "\n姓名：" + name + "\n成绩：" + score;
    }

}