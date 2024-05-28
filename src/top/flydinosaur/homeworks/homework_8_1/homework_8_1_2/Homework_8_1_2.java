package top.flydinosaur.homeworks.homework_8_1.homework_8_1_2;

import java.util.Scanner;

public class Homework_8_1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle(scanner.next(), scanner.nextBoolean(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        System.out.println(triangle.toString());
    }
}

class GeometricObject{
    protected String color;
    protected boolean filled;

    public GeometricObject() {
        color = "white";
        filled = false;
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString(){
        String temp = "";
        if (filled == false) {
            temp = "未填充";
        } else {
            temp = "填充";
        }
        return "颜色为" + getColor() + "\n" + temp;
    }

}

class Triangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        side1 = 0.0;
        side2 = 0.0;
        side3 = 0.0;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea(){
        double p = (side1 + side2 + side3) / 2;
        double s = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        return s;
    }

    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    @Override
    public String toString(){
        return super.toString() + "\n三条边\t" + side1 + "\t" + side2 + "\t" + side3 + "\n周长\t" + getPerimeter() + "\n面积\t" + getArea();
    }
}