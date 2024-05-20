package top.flydinosaur.experiments.experiment_2.experiment_2_1;

import java.util.Arrays;
import java.util.Scanner;

public class Experiment_2_1 {

    public static void main(String[] args) {

        Circle[] circles = new Circle[5];
        Rectangle[] rectangles = new Rectangle[4];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            rectangles[i] = new Rectangle(scanner.nextDouble(), scanner.nextDouble());
        }

        for (int i = 0; i < 5; i++) {
            circles[i] = new Circle(scanner.nextDouble());
        }

        Arrays.sort(circles);
        Arrays.sort(rectangles);

        for (int i = 0; i < 4; i++) {
            System.out.println(rectangles[i].toString());
        }

        System.out.println("-----------------------------------");

        for (int i = 0; i < 5; i++) {
            System.out.println(circles[i].toString());
        }
    }

}

abstract class GeometricObject implements Comparable<GeometricObject> {

    public double getArea(){
        return 0;
    }

    public double getPerimeter(){
        return 0;
    }

    @Override
    public int compareTo(GeometricObject o) {
        return Double.compare(this.getArea(), o.getArea());
    }

}

class Circle extends GeometricObject {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public String toString(){
        return "圆的半径：" + radius + "\t面积：" + getArea();
    }

}

class Rectangle extends GeometricObject {

    private double width;
    private double height;

    public Rectangle() {}

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (height + width);
    }

    @Override
    public String toString(){
        return "矩形的高：" + height + "\t宽：" + width + "\t面积：" + getArea();
    }

}