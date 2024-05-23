package top.flydinosaur.homeworks.homework_13.homework_13_1;

import java.util.Scanner;

public class Homework_13_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Triangle triangle = new Triangle(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
            System.out.println(triangle.toString());
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        } finally {
            scanner.close();
        }
    }
}

class IllegalTriangleException extends Exception {
    private double a;
    private double b;
    private double c;
    public IllegalTriangleException(double a, double b, double c) {
        super("三条边为" + a + "," + b + "," + c + ",不满足任意两条边的和大于第三条边的规则");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString(){
        return a + "\n" + b + "\n" + c;
    }
}

class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) throws IllegalTriangleException {
        if ((a + b <= c) || (b + c <= a) || (c + a <= b)) {
            throw new IllegalTriangleException(a, b, c);
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "周长是 " + getPerimeter() + "\n面积是 " + getArea();
    }

}
