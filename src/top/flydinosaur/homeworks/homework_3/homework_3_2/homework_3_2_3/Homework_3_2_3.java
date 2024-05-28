package top.flydinosaur.homeworks.homework_3.homework_3_2.homework_3_2_3;

import java.util.Scanner;

public class Homework_3_2_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            Rectangle rectangle = new Rectangle(scanner.nextDouble(), scanner.nextDouble());
            System.out.println("宽为" + rectangle.getWidth() + "高为" + rectangle.getHeight() + "面积为" + rectangle.getArea());
            System.out.println("周长为" + rectangle.getPerimeter());
            System.out.println("矩形对象的个数为" + Rectangle.getNumberOfRectangle());
        }
    }

    static class Rectangle{
        private static int numberOfRectangle = 0;
        private double width;
        private double height;

        public Rectangle(){
            this.width = 1;
            this.height = 1;
            numberOfRectangle++;

        }

        public Rectangle(double width, double height){
            this.width = width;
            this.height = height;
            numberOfRectangle++;
        }

        public double getArea(){
            return this.width * this.height;
        }

        public double getPerimeter(){
            return (this.width + this.height) * 2;
        }

        public double getWidth() {
            return width;
        }

        public double getHeight() {
            return height;
        }

        public static int getNumberOfRectangle(){
            return numberOfRectangle;
        }

    }


}