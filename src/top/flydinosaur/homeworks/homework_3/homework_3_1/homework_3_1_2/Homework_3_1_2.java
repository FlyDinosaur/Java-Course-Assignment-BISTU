package top.flydinosaur.homeworks.homework_3.homework_3_1.homework_3_1_2;

import java.util.Scanner;

public class Homework_3_1_2 {
    public static class Vehicle{
        private float speed;
        public Vehicle(){

        }
        public Vehicle(float speed){
            this.speed = speed;
        }
        public void setSpeed(float speed){
            this.speed = speed;
        }
        public float getSpeed(){
            return this.speed;
        }
        public void speedUp(float up){
            this.speed += up;
            if (this.speed >= 240){
                this.speed = 240;
            }
        }
        public void speedDown(float down){
            this.speed -= down;
            if (this.speed <= 0){
                this.speed = 0;
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle car = new Vehicle();
        car.setSpeed(scanner.nextFloat());
        System.out.println("初始速度是" + car.getSpeed());
        float temp = scanner.nextFloat();
        car.speedUp(temp);
        System.out.println("加速" + temp + "后的速度是" + car.getSpeed());
        temp = scanner.nextFloat();
        car.speedDown(temp);
        System.out.println("降速" + temp + "后的速度是" + car.getSpeed());
        scanner.close();
    }
}