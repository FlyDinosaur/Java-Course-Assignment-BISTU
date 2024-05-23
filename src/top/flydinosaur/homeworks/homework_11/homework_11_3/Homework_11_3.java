package top.flydinosaur.homeworks.homework_11.homework_11_3;

import java.util.Scanner;

abstract class Figure{
    public Figure() {
    }

    abstract double getArea();
}

class Rectangle extends Figure{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

}

class Circle extends Figure{
    private double radius;
    private final double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return pi * radius * radius;
    }

}


public class Homework_11_3 {

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        double a=input.nextDouble();

        double b=input.nextDouble();

        double c=input.nextDouble();

        double d=input.nextDouble();

        double e=input.nextDouble();

        double f=input.nextDouble();

        Figure g[]={new Rectangle(a,b),new Circle(c),new Circle(d),new Rectangle(e,f)};

        System.out.println("the total area is "+ sum(g));

    }

    static double sum(Figure[] g){
        double sum = 0.0;
        for (Figure f:g) {
            sum += f.getArea();
        }
        return sum;
    }

}