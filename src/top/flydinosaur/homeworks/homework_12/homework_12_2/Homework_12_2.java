package top.flydinosaur.homeworks.homework_12.homework_12_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework_12_2 {

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
