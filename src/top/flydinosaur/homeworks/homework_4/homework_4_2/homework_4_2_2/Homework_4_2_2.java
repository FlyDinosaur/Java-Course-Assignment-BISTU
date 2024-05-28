package top.flydinosaur.homeworks.homework_4.homework_4_2.homework_4_2_2;

import java.util.Scanner;

public class Homework_4_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BMI person = new BMI();
        person.setName(scanner.nextLine());
        person.setAge(scanner.nextInt());
        person.setWeight(scanner.nextDouble());
        person.setHeight(scanner.nextDouble());
        System.out.println("姓名" + person.getName());
        System.out.println("年龄" + person.getAge());
        System.out.println("体重指数" + person.getBMI());
        System.out.println("体重状况" + person.getStatus());
    }
}

class BMI {
    private String name;
    private int age;
    private double  weight;
    private double height;
    private double bmi;
    public BMI(){

    }
    public BMI(String name, int age, double weight, double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBMI(){
        bmi = weight / (height * height );
        return bmi;
    }

    public String getStatus(){
        if (bmi < 18.5) {
            return "低重";
        } else if (bmi >= 18.5 & bmi < 25.0) {
            return "正常";
        } else if (bmi >= 25.0 & bmi < 30.0) {
            return "超重";
        } else {
            return "肥胖";
        }
    }

}
