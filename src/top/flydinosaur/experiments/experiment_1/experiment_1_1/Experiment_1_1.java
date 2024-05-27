package top.flydinosaur.experiments.experiment_1.experiment_1_1;

import java.util.Scanner;

public class Experiment_1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setRadius(scanner.nextDouble());
        scanner.nextLine(); //清除缓存区的换行符，防止出现报错
        fan1.setColor(scanner.nextLine());
        fan1.setOn(scanner.nextBoolean());
        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setRadius(scanner.nextDouble());
        scanner.nextLine();
        fan2.setColor(scanner.nextLine());
        fan2.setOn(scanner.nextBoolean());
        System.out.println(fan1.toString());
        System.out.println();
        System.out.println(fan2.toString());
    }
}

class Fan{
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;

    private int speed;
    private double radius;
    private String color;
    private boolean on;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public Fan(){
        speed = SLOW;
        radius = 5;
        color = "blue";
        on = false;
    }

    public Fan(int speed, double radius, String color, boolean on){
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.on = on;
    }

    @Override //标注重写Object类的toString函数
    public String toString(){
        if (on == true){
            return "该风扇的速度为" + speed + "\n颜色是" + color + "\n半径是" + radius;
        }
        else {
            return "风扇没有开启" + "\n该风扇的颜色是" + color + "\n半径是" + radius;
        }
    }

}