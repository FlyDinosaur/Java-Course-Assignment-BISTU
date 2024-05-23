package top.flydinosaur.homeworks.homework_13.homework_13_2;

import java.util.Scanner;

public class Homework_13_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Person p1 = new Person(scanner.next(), scanner.nextInt());
            System.out.println(p1.toString());
        } catch (IllegalAgeException e) {
            System.out.println(e.getMessage());
            System.out.println("你输入的年龄为" + e.getAge());
        }

    }
}

class IllegalAgeException extends Exception {
    private int age;

    public IllegalAgeException(int age) {
        super("你输入的年龄为非法负数");
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws IllegalAgeException {
        if (age < 0) {
            throw new IllegalAgeException(age);
        }
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "姓名为 " + name + "\n年龄为 " + age;
    }
}