package top.flydinosaur.homeworks.homework_4.homework_4_1.homework_4_1_3;

import java.util.Scanner;

public class Homework_4_1_3 {
    public static void main(String[] arg){

        Scanner input = new Scanner(System.in);

        Account a = new Account(input.nextInt(),input.nextDouble());

        System.out.println("账户是" + a.getId() + "\n初始余额是" + a.getBalance());

        a.withDraw(input.nextDouble());

        a.deposit(input.nextDouble());

    }

}

class Account{

    private int id;
    private double balance;
    public Account(){
        id = 0;
        balance = 0;
    }
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withDraw(double temp){
        if (temp > balance){
            System.out.println("余额不足");
        }
        else{
            balance -= temp;
            System.out.println("取款后余额是" + getBalance());
        }
    }

    public void deposit(double temp){
        balance += temp;
        System.out.println("存款后余额是" + getBalance());
    }

}