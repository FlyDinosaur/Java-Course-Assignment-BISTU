package top.flydinosaur.homeworks.homework_7.homework_7_2;

public class Homework_7_2 {
    public static void main(String[] args) {

        Person p = new Person("张三", "北京", "ab@126.com", "111");
        Student st = new Student("李四", "北京", "cd@126.com", "222", 1);
        Employee e = new Employee("王五", "上海", "ef@126.com", "333", "二教", 6000);
        Faculty f = new Faculty("赵六", "上海", "hi@126.com", "444", "二教", 5000, "9点", 3);
        Staff staff = new Staff("孙七", "上海", "jk@126.com", "555", "三教", 5000, 2);

        System.out.println(p.toString());
        System.out.println();
        System.out.println(st.toString());
        System.out.println();
        System.out.println(e.toString());
        System.out.println();
        System.out.println(f.toString());
        System.out.println();
        System.out.println(staff.toString());
    }
}

class Person{
    protected String name;
    protected String address;
    protected String email;
    protected String phoneNumber;

    public Person(){

    }

    public Person(String name, String address, String email, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString(){
        return "姓名" + name + "\n地址" + address + "\n电话号码" + phoneNumber + "\n电子邮件" + email;
    }
}

class Student extends Person{
    private static final int[] GRADE = {1, 2, 3, 4};
    private int grade;

    public Student() {
    }

    public Student(String name, String address, String email, String phoneNumber, int grade) {
        super(name, address, email, phoneNumber);
        if (grade == 1){
            this.grade = GRADE[0];
        } else if (grade == 2) {
            this.grade = GRADE[1];
        } else if (grade == 3) {
            this.grade = GRADE[2];
        } else {
            this.grade = GRADE[3];
        }
    }

    @Override
    public String toString(){
        return "姓名" + name + "\n地址" + address + "\n电话号码" + phoneNumber + "\n电子邮件" + email + "\n年级" + grade;
    }

}

class Employee extends Person{
    protected String office;
    protected int salary;

    public Employee(){

    }

    public Employee(String office, int salary) {
        this.office = office;
        this.salary = salary;
    }

    public Employee(String name, String address, String email, String phoneNumber, String office, int salary) {
        super(name, address, email, phoneNumber);
        this.office = office;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "姓名" + name + "\n地址" + address + "\n电话号码" + phoneNumber + "\n电子邮件" + email + "\n办公室" + office + "\n工资" + salary;
    }
}

class Faculty extends Employee{
    private String officeHours;
    private int joblevel;
    private static final String[] JOBLEVEL = {"助教", "讲师", "副教授", "教授"};

    public Faculty(){

    }

    public Faculty(String name, String address, String email, String phoneNumber, String office, int salary, String officeHours, int joblevel){
        super(name, address, email, phoneNumber, office, salary);
        this.officeHours = officeHours;
        this.joblevel = joblevel;
    }

    @Override
    public String toString(){
        return "姓名" + name + "\n地址" + address + "\n电话号码" + phoneNumber + "\n电子邮件" + email + "\n办公室" + office + "\n工资" + salary + "\n办公时间" + officeHours + "\n职称" + joblevel;
    }
}

class Staff extends Employee{
    private static final String[] JOBTITLE = {"科级", "处级"};
    private String jobTitle;

    public Staff(){

    }

    public Staff(String name, String address, String email, String phoneNumber, String office, int salary, int jobTitle){
        super(name, address, email, phoneNumber, office, salary);
        if (jobTitle == 1){
            this.jobTitle = JOBTITLE[0];
        } else {
            this.jobTitle = JOBTITLE[1];
        }
    }

    @Override
    public String toString(){
        return "姓名" + name + "\n地址" + address + "\n电话号码" + phoneNumber + "\n电子邮件" + email + "\n办公室" + office + "\n工资" + salary + "\n职务" + jobTitle;
    }

}
