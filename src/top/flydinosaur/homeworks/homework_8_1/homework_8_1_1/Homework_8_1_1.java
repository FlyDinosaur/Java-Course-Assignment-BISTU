package top.flydinosaur.homeworks.homework_8_1.homework_8_1_1;

import java.util.Scanner;

public class Homework_8_1_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MonthWorker worker_1 = new MonthWorker(scanner.next(), scanner.nextDouble());
        WeekWorker worker_2 = new WeekWorker(scanner.next(), scanner.nextDouble());
        Company company = new Company();
        company.addEmloyee(worker_1);
        company.addEmloyee(worker_2);
        System.out.println(company.toString());
    }

}

class Employee{
    protected String name;
    public Employee(){

    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double earnings(){
        return 0;
    }

    @Override
    public String toString(){
        return "\n姓名\t" + name;
    }

}

class MonthWorker extends Employee{
    private double monthSal;

    public MonthWorker() {

    }

    public MonthWorker(String name, double monthSal) {
        super(name);
        this.monthSal = monthSal;
    }

    public double getMonthSal() {
        return monthSal;
    }

    public void setMonthSal(double monthSal) {
        this.monthSal = monthSal;
    }

    @Override
    public double earnings() {
        return monthSal * 12;
    }

    @Override
    public String toString() {
        return super.toString() + "\n月薪为\t" + monthSal + "\n年薪为\t" + earnings();
    }
}

class WeekWorker extends Employee{
    private double weekSal;

    public WeekWorker(){

    }

    public WeekWorker(String name, double weekSal) {
        super(name);
        this.weekSal = weekSal;
    }

    public double getWeekSal() {
        return weekSal;
    }

    public void setWeekSal(double weekSal) {
        this.weekSal = weekSal;
    }

    @Override
    public double earnings(){
        return weekSal * 52;
    }

    @Override
    public String toString(){
        return super.toString() + "\n周薪为\t" + weekSal + "\n年薪为\t" + earnings();
    }

}

class Company{

    private int numberOfWorkers = 0;
    private Employee[] employees = new Employee[numberOfWorkers];

    public Company() {
    }

    public double computeTotalSal(){
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].earnings();
        }
        return sum;
    }

    public void addEmloyee(Employee e){
        numberOfWorkers = employees.length;
        numberOfWorkers++;
        Employee[] temp = new Employee[numberOfWorkers];
        System.arraycopy(employees, 0, temp, 0, employees.length);
        employees = temp;
        employees[numberOfWorkers - 1] = e;
    }

    @Override
    public String toString() {
        String temp = "";
        for (int i = 0; i < employees.length; i++) {
            temp += employees[i].toString();
        }
        temp += "\n\n公司年工资总额\t" + computeTotalSal();
        return temp;
    }

}
