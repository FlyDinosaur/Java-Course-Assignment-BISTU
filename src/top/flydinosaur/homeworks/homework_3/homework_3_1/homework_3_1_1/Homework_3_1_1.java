package top.flydinosaur.homeworks.homework_3.homework_3_1.homework_3_1_1;

import java.util.Scanner;

public class Homework_3_1_1 {

    public static class Rectangle{
        private double width;
        private double height;

        public double getArea(){
            return width * height;
        }

        public double getPerimeter(){
            return 2 * (width + height);
        }

        public void setWidth(double width){
            this.width = width;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getWidth(){
            return this.width;
        }
        public double getHeight(){
            return this.height;
        }
    }
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        rectangle.setWidth(scanner.nextDouble());
        rectangle.setHeight(scanner.nextDouble());
        System.out.println("宽为" + rectangle.getWidth());
        System.out.println("高为" + rectangle.getHeight());
        System.out.println("面积为" + rectangle.getArea());
        System.out.println("周长为" + rectangle.getPerimeter());
        scanner.close();

    }

}