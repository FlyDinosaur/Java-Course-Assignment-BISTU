package top.flydinosaur.homeworks.homework_12.homework_12_1;

import java.util.Date;
import java.util.Scanner;

public class Homework_12_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入圆的相关信息：");
        Circle c1 = new Circle(Color.BLUE, scanner.nextBoolean(), scanner.nextDouble());
        Circle c2 = new Circle(Color.GOLD, scanner.nextBoolean(), scanner.nextDouble());
        System.out.println(c1.toString());
        System.out.println(c1.equals(c2));

        System.out.println();

        System.out.println("请输入矩形的相关信息：");
        Rectangle r1 = new Rectangle(Color.RED, scanner.nextBoolean(), scanner.nextDouble(), scanner.nextDouble());
        Rectangle r2 = new Rectangle(Color.GREEN, scanner.nextBoolean(), scanner.nextDouble(), scanner.nextDouble());
        System.out.println(r1.toString());
        System.out.println(r1.equals(r2));
    }
}
class Color {
    private float red;
    private float green;
    private float blue;
    public static final Color BLACK = new Color(0.0f, 0.0f, 0.0f);
    public static final Color BLUE = new Color(0.0f, 0.0f, 1.0f);
    public static final Color GOLD = new Color(1.0f, 0.84313726f, 0.0f);
    public static final Color GRAY = new Color(0.5019608f, 0.5019608f, 0.5019608f);
    public static final Color GREEN = new Color(0.0f, 0.5019608f, 0.0f);
    public static final Color RED = new Color(1.0f, 0.0f, 0.0f);
    public static final Color WHITE = new Color(1.0f, 1.0f, 1.0f);
    public Color(){

    }

    public Color(float red, float green, float blue){
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Color color = (Color)obj;
        return (color.red == this.red && color.green == this.green && color.blue == this.blue);
    }

    @Override
    public String toString(){
        if (this.equals(BLACK))
            return "黑色";
        else if (this.equals(BLUE))
            return "蓝色";
        else if (this.equals(GOLD))
            return "金色";
        else if (this.equals(GRAY))
            return "灰色";
        else if (this.equals(GREEN))
            return "绿色";
        else if (this.equals(RED))
            return "红色";
        else
            return "白色";
    }

}

class GeometricObject {
    protected Color color;
    protected boolean isFilled;
    protected Date createdDate;

    public GeometricObject(){
        color = Color.WHITE;
    }
    public GeometricObject(Color color, boolean isFilled){
        this.color = color;
        this.isFilled = isFilled;
    }

    @Override
    public String toString(){
        String temp = "";
        if (isFilled == false){
            temp = "不填充";
        }
        else{
            temp = "填充";
        }
        return "颜色\t" + color.toString() + "\n是否填充\t" + temp;
    }

    public double getArea(){
        return 0.0;
    }
}

class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle(){

    }
    public Rectangle(Color color, boolean isFilled, double width, double height){
        super(color, isFilled);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea(){
        return width * height;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle)obj;
        return (this.getArea() == rectangle.getArea());
    }

    @Override
    public String toString(){
        String temp = "";
        if (isFilled == false){
            temp = "不填充";
        }
        else{
            temp = "填充";
        }
        return super.toString() + "\n宽为\t" + width + "\n高为\t" + height + "\n面积\t" + getArea();
    }

}

class Circle extends GeometricObject {
    private double radius;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(Color color, boolean isFilled, double radius){
        super(color, isFilled);
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public String toString(){
        String temp = "";
        if (isFilled == false){
            temp = "不填充";
        }
        else{
            temp = "填充";
        }
        return super.toString() + "\n半径\t" + radius + "\n面积\t" + getArea();
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Circle circle = (Circle)obj;
        return (radius == circle.radius);
    }
}



