package top.flydinosaur.homeworks.homework_5.homework_5_2;

import java.util.Scanner;

public class Homework_5_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student stu1 = new Student(scanner.next(), scanner.nextDouble());

        Student stu2 = new Student(scanner.next(), scanner.nextDouble());

        Student stu3 = new Student(scanner.next(), scanner.nextDouble());

        School school = new School();

        Student[] students={stu1,stu2,stu3};

        school.setStudents(students);

        System.out.println("姓名\t\t" + "成绩");

        System.out.println("-------------------------");

        System.out.println(school.toString());
        System.out.println("所招学生的平均分为" + school.getAverageScore() + "分");
    }

}

class Student{
    private String name;
    private double score;

    public Student(){

    }

    public Student(String name, double score){
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString(){
        return name + "\t\t" + score;
    }

}

class School{
    private String name;
    private Student[] students;

    public School(){

    }
    public School(String name, Student[] students){
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public double getAverageScore(){
        double sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += students[i].getScore();
        }
        return (sum / 3);
    }

    @Override
    public String toString(){
        String temp = "";
        for (int i = 0; i < 3; i++) {
            temp +=  students[i].getName() + "\t\t" + students[i].getScore() + "\n";
        }
        return temp;
    }
}
