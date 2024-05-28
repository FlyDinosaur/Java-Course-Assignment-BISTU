package top.flydinosaur.homeworks.homework_4.homework_4_2.homework_4_2_1;

import java.util.Scanner;

public class Homework_4_2_1 {

    public static Circle[] createCircleArray(){
        Scanner scanner = new Scanner(System.in);
        Circle[] temp  = new Circle[3];
        for (int i = 0; i < 3; i++) {
            temp[i] = new Circle();
            temp[i].setRadius(scanner.nextDouble());
        }
        return temp;
    }

    public static double sum(Circle[] circles){
        double sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += circles[i].getArea();
        }
        return sum;
    }

    public static void printCircleArray(Circle[] circles){
        for (int i = 0; i < 3; i++) {
            System.out.println(circles[i].getRadius() + "\t" + circles[i].getArea());
        }
    }

    public static void main(String[] args) {
        Circle circles[] = createCircleArray();
        System.out.println("半径" + "\t" + "面积");
        printCircleArray(circles);
        System.out.println();
        System.out.println("总面积为" + sum(circles));
    }

}



class Circle{
    private double radius;
    private double area;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        area = 3.14 * radius * radius;
        return area;
    }

    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }

}
