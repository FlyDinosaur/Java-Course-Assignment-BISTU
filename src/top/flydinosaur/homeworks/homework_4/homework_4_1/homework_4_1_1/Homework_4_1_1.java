package top.flydinosaur.homeworks.homework_4.homework_4_1.homework_4_1_1;

import java.util.Scanner;

public class Homework_4_1_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point point_1 = new Point();
        Point point_2 = new Point();
        point_1.setX(scanner.nextDouble());
        point_1.setY(scanner.nextDouble());
        point_2.setX(scanner.nextDouble());
        point_2.setY(scanner.nextDouble());

        System.out.println("两点距离为" + String.format("%.2f", point_1.distance(point_2)));
    }

}

class Point {

    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point p) {
        return Math.sqrt(((this.x - p.getX()) * (this.x - p.getX())) + ((this.y - p.getY()) * (this.y - p.getY())));
    }
}

