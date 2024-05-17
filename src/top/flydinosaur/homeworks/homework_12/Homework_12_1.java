package top.flydinosaur.homeworks.homework_12;

//图形UML类图如下面图所示，说明如下：
//（1）所有类省略成员变量的修改器和读取器；
//（2）GeometricObject类的color、isFilled、createdDate属性分别表示图形的颜色、是否填充和创建日期；
//（3）GeometricObject类的toString()方法，返回描述图形颜色、是否填充信息的字符串（不需要返回创建时间）；
//（4）Rectangle类width和heigth属性分别表示矩形的宽和高；
//（5）Rectangle类的toString()方法返回描述矩形的颜色、是否填充、半径、面积信息（getArea()方法实现），注意调用父类的toString()方法获取矩形的颜色和是否填充信息；
//（6）Rectangle类的equals方法用于判断两个矩形对象是否相等，判断依据：如果两个矩形的面积相等，则二者相等；
//（7）Circle类中的toString()方法返回描述圆的颜色、是否填充、半径、面积信息（getArea()方法实现），注意调用父类的toString()方法获取圆的颜色和是否填充信息；
//（8）Circle类的equals方法用于判断两个圆对象是否相等，判断依据：如果两个圆的半径相等，则二者相等；
//（9）Color类的三个成员变量red、green、blue，分别表示颜色中红绿蓝三原色的透明度值，三者的取值范围为[0.0 - 1.0]，带下划线部分表示静态常量，等号右侧给出了三原色的透明度值；
//（10）Color类的equals()方法用于判断两个颜色对象是否相等，判断依据：如果两个颜色的三原色的透明度值相等，则二者相等；例如：Color(0.1,0.3,0.2)与Color(0.1,0.3,0.2)的颜色值相等。
//（11）Color类的toString()方法，用于返回描述颜色的字符串。
//编程要求：（1）编程实现GeometricObject、Circle、Rectangle类；
//        （2）下面给出了Color类的部分代码（省略修改器和读取器，需要自己补充），请补充
//public class Color {
//    private float red;
//    private float green;
//    private float blue;
//    public static final Color BLACK = new Color(0.0f, 0.0f, 0.0f);
//    public static final Color BLUE = new Color(0.0f, 0.0f, 1.0f);
//    public static final Color GOLD = new Color(1.0f, 0.84313726f, 0.0f);
//    public static final Color GRAY = new Color(0.5019608f, 0.5019608f, 0.5019608f);
//    public static final Color GREEN = new Color(0.0f, 0.5019608f, 0.0f);
//    //补充代码1： 写出常量RED和WHITE的定义，二者三种颜色的值分别为：（1.0，0.0，0.0）和（1.0，1.0，1.0）
//
//    public Color(){
//    }
//    public Color(float red, float green, float blue){
//        this.red = red;
//        this.green = green;
//        this.blue = blue;
//    }
//    //补充代码2：完成equals方法，当指定颜色对象（obj）和当前颜色（this）的红、绿、蓝三种颜色透明度值相等时，判断二者相等。
//
//    public String toString(){
//        if (this.equal(BLACK))
//            return "黑色";
//        //补充代码3：补充对其他颜色的转换
//
//    }
//}
////    （3）按照要求补充测试类TestGeometricObject的部分代码。【注意往平台上复制代码的时候，把测试类定义为public，放在最前面，且把”import java.util.Date” 和 “import java.util.Scanner”语句放在第一行。其他类要去掉public】
//import java.util.Scanner;
//public class TestGeometricObject {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        //补充代码1： 创建两个Circle对象c1和c2，c1的颜色为蓝色（BLUE），c2的颜色为金色（GOLD），分别从键盘读入是否填充，以及半径。
//
//        System.out.println(c1.toString());
//        System.out.println(c1.equals(c2));
//        //补充代码2： 创建两个Rectangle对象r1和r2，r1的颜色为红色（RED），c2的颜色为绿色（GREEN），分别从键盘读入是否填充，以及矩形的宽和高。
//
//        System.out.println(r1.toString());
//        System.out.println(r1.equals(r2));
//    }
//}
//

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



