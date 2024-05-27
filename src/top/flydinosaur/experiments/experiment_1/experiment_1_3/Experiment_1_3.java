package top.flydinosaur.experiments.experiment_1.experiment_1_3;

import java.util.Scanner;

public class Experiment_1_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MyPoint p1 = new MyPoint(scanner.nextDouble(), scanner.nextDouble());

        MyPoint p2 = new MyPoint(scanner.nextDouble(), scanner.nextDouble());

        System.out.println("使用MyPoint的参数为MyPoint的实例方法distance计算p1和p2的距离为：\t" + p1.distance(p2));

        System.out.println("使用MyPoint的类方法distance计算p1和p2的距离为：\t" + MyPoint.distance(p1, p2));

        System.out.println("使用MyPoint的参数为double的实例方法distance计算p1到某个点的距离为：\t" +p1.distance(5.8,6.0));

    }
}

class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static double distance(MyPoint p1, MyPoint p2) {
        double dx = p1.getX() - p2.getX();
        double dy = p1.getY() - p2.getY();
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    public double distance(MyPoint p) {
        double dx = p.getX() - x;
        double dy = p.getY() - y;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    public double distance(double x, double y) {
        double dx = this.x - x;
        double dy = this.y - y;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

}
