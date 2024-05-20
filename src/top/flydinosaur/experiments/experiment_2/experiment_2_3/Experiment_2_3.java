package top.flydinosaur.experiments.experiment_2.experiment_2_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Experiment_2_3 { //记得改为TestEmployee

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        //创建一个普通员工Employee对象，并加入列表中
        employees.add(new Employee(scanner.nextInt(), scanner.next(), scanner.nextDouble()));
        //创建一个PC对象，赋给下面的程序员Programmer对象
        Equipment e = new PC(scanner.next(), scanner.next());
        //创建一个程序员Programmer对象，并加入列表中
        employees.add(new Programmer(scanner.nextInt(), scanner.next(), scanner.nextDouble(),Status.BUSY,e, scanner.nextDouble()));
        //创建一个打印机Printer对象，赋给下面的设计师Designer对象
        e = new Printer(scanner.next(), scanner.next());
        //创建一个设计师Designer对象，并加入列表中
        employees.add(new Designer(scanner.nextInt(), scanner.next(),  scanner.nextDouble(),Status.VOCATION,e, scanner.nextDouble(),scanner.nextInt()));
        System.out.println("--------------------------------员工列表----------------------------------");
        System.out.println("ID\t姓名\t工资\t职位\t状态\t奖金\t股票\t领用设备");
        for(int i = 0; i < employees.size(); i++){
            System.out.println(employees.get(i).toString());
        }
    }

}

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return getId() + "\t" + getName() + "\t" + getSalary() + "\t" + "普通员工";
    }
}

class Programmer extends Employee {
    private Status status;
    private Equipment equipment;
    private double bonus;

    public Programmer(int id, String name, double salary, Status status, Equipment equipment, double bonus) {
        super(id, name, salary);
        this.status = status;
        this.equipment = equipment;
        this.bonus = bonus;
    }

    public String getStatus() {
        return status.getName();
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getEquipment() {
        return equipment.getDescription();
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.getId() + "\t" + super.getName() + "\t" + super.getSalary() + "\t" + "程序员" + "\t" + getStatus() + "\t" + getBonus() + "\t" + "\t" + getEquipment();
    }

}

class Designer extends Programmer {
    private int stock;

    public Designer(int id, String name, double salary, Status status, Equipment equipment, double bonus, int stock) {
        super(id, name, salary, status, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return super.getId() + "\t" + super.getName() + "\t" + super.getSalary() + "\t" + "设计师" + "\t" + super.getStatus() + "\t" + super.getBonus() + "\t" + getStock() + "\t" + super.getEquipment();
    }

}

class Status {
    private String name;
    public static final Status BUSY = new Status("工作");
    public static final Status VOCATION = new Status("休假");

    private Status(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

interface Equipment {
    public String getDescription();
}

class PC implements Equipment {

    private String model;
    private String display;

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String getDescription(){
        return "PC机(" + model + "/ " + display + ")";
    }
}

class Printer implements Equipment {
    private String name;
    private String type;

    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getDescription(){
        return "打印机(" + name + "/ " + type + ")";
    }

}
