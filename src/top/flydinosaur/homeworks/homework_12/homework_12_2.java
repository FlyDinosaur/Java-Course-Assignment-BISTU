package top.flydinosaur.homeworks.homework_12;

//  一个公司（Company）包含若干员工（Worker），员工每月领取工资，公司能够计算每个月付给员工的工资总和，两个类具体说明如下
//  1)Worker类
//  a)一个私有的name属性存放员工的姓名；
//  b)一个私有的sal属性存放员工的工资；
//  c)一个公有的不带参数的构造方法；
//  d)一个共有的带参数的构造方法；
//  e)name和sal属性的set方法和get方法；
//  f)一个公有的toString()方法，返回员工的姓名和工资

//  (2) Company类
//  a) 一个私有的name属性存放公司的名称；
//  b) 一个私有的ArrayList<Worker>类型的workers属性存放公司员工；
//  c) 一个无参的和一个有参的构造方法；
//  d) 两个属性的set和get方法；
//  e) 一个公有的添加员工的方法addWorker( );
//  f) 一个公有的earnings()方法，用于计算所有员工每个月的总工资；
//  g) 一个公有的toString()方法，用于返回公司所有员工的姓名和工资信息

//import java.util.Scanner;
//public class TestCompanyWorker {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        Worker worker1 = new Worker(scanner.next(), scanner.nextDouble());
//        Worker worker2 = new Worker(scanner.next(), scanner.nextDouble());
//        Worker worker3 = new Worker(scanner.next(), scanner.nextDouble());
//        Company company = new Company();
//        //补充代码1：把worker1、worker2和worker3添加到company对象中
//
//        System.out.println("姓名\t\t" + "工资");
//        System.out.println("-------------------------");
//        System.out.println(company.toString());
//        //补充代码2：按照样例输出公司每个月的总工资
//
//    }
//}

import java.util.ArrayList;
import java.util.Scanner;

public class homework_12_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Worker worker1 = new Worker(scanner.next(), scanner.nextDouble());
        Worker worker2 = new Worker(scanner.next(), scanner.nextDouble());
        Worker worker3 = new Worker(scanner.next(), scanner.nextDouble());
        Company company = new Company();

        ArrayList<Worker> workers= new ArrayList<Worker>();
        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);

        company.setWorkers(workers);

        System.out.println("姓名\t\t" + "工资");
        System.out.println("-------------------------");
        System.out.println(company.toString());
    }

}

class Worker{
    private String name;
    private double sal;

    public Worker() {
    }

    public Worker(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "\t" + sal;
    }
}

class Company{
    private String name;
    private ArrayList<Worker> workers;

    public Company() {
    }

    public Company(String name, ArrayList<Worker> workers) {
        this.name = name;
        this.workers = workers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(ArrayList<Worker> workers) {
        this.workers = workers;
    }

    public double earnings() {
        double sum = 0;
        for (Worker worker : workers) {
            sum += worker.getSal();
        }
        return sum;
    }

    @Override
    public String toString() {
        String temp = "";
        for (Worker worker : workers) {
            temp += worker + "\n";
        }
        return temp + "工资合计\t" + earnings();
    }

}
