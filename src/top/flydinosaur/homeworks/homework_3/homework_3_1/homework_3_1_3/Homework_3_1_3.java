package top.flydinosaur.homeworks.homework_3.homework_3_1.homework_3_1_3;

import java.util.Scanner;

public class Homework_3_1_3 {

    public static class Point {
        double x;
        double y;

        public Point(){

        }
        public Point(double x, double y){
            this.x = x;
            this.y = y;
        }

        public double getDistanceToBase() {
            double tempx = this.x;
            double tempy = this.y;
            return Math.sqrt(tempx * tempx + tempy * tempy);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point p1 = new Point(3, 4);
        Point p2 = new Point();
        p2.x = scanner.nextDouble();
        p2.y = scanner.nextDouble();
        System.out.println("p1距离原点的距离为" + p1.getDistanceToBase());
        System.out.println("p2距离原点的距离为" + p2.getDistanceToBase());


    }
}