package top.flydinosaur.homeworks.homework_5.homework_5_1;

import java.util.Scanner;

public class Homework_5_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] student = new Student[2];
        for (int i = 0; i < 2; i++) {
            student[i] = new Student();
            student[i].setName(scanner.nextLine());
            float experimentScore = scanner.nextFloat();
            float projectScore = scanner.nextFloat();
            student[i].setScores(experimentScore, projectScore);
            scanner.nextLine();
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(student[i].toString());
            System.out.println();
        }

        scanner.close();
    }

}

class Student{
    private String name;
    private Score scores;
    public Student(){

    }
    public Student(String name, Score scores){
        this.name = name;
        this.scores = scores;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScores(float experiment, float project) {
        this.scores = new Score(experiment, project);
    }
    @Override
    public String toString(){
        return "学生姓名 " + name + "\n" + scores.toString();
    }
}

class Score{
    private float experiment;
    private float project;

    public Score(){

    }
    public Score(float experiment, float project){
        this.experiment = experiment;
        this.project = project;
    }

    public float getExperiment() {
        return experiment;
    }

    public void setExperiment(float experiment) {
        this.experiment = experiment;
    }

    public float getProject() {
        return project;
    }

    public void setProject(float project) {
        this.project = project;
    }

    @Override
    public String toString(){
        return "实验成绩 " + experiment + "\n项目成绩 " + project;
    }

}