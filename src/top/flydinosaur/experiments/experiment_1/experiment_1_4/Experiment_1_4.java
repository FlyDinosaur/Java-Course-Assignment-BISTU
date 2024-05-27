package top.flydinosaur.experiments.experiment_1.experiment_1_4;

import java.util.Scanner;

public class Experiment_1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circle c1 = new Circle();
        c1.setO(scanner.nextDouble(), scanner.nextDouble());
        c1.setRadius(scanner.nextDouble());
        System.out.println("c1的圆心坐标值为(" + c1.getO().getX() + "," + c1.getO().getY() + ")");
        System.out.println("c1的面积为" + c1.getArea() + " c1的周长为" + c1.getPerimeter());
        System.out.println();

        Point temp = new Point(scanner.nextDouble(), scanner.nextDouble());
        Circle c2 = new Circle(temp, scanner.nextDouble());
        Point p = new Point();
        p.setX(scanner.nextDouble());
        p.setY(scanner.nextDouble());
        System.out.println("点p" + c2.contains(p) + "c2内部");
        System.out.println("c2的面积为" + c2.getArea());
        System.out.println("c2的周长为" + c2.getPerimeter());

        scanner.close();
    }
}

class Point{
    private double x;
    private double y;
    public Point(){

    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double _x) {
        x = _x;
    }

    public double getY() {
        return y;
    }

    public void setY(double _y) {
        y = _y;
    }
}

class Circle{
    private Point o = new Point();
    private double radius;
    private final double PI = 3.14;
    public Circle(){

    }

    public Circle(Point p, double r) {
        o = p;
        radius = r;
    }

    public Point getO() {
        return o;
    }

    public void setO(double x, double y) {
        o.setX(x);
        o.setY(y);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String contains(Point p){
        double x = p.getX();
        double y = p.getY();
        double distance = Math.sqrt(Math.pow(x - o.getX(), 2) + Math.pow(y - o.getY(), 2));
        if (distance < radius){
            return "在";
        }
        else{
            return "不在";
        }
    }

    public double getArea(){
        return PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * PI * radius;
    }
}
