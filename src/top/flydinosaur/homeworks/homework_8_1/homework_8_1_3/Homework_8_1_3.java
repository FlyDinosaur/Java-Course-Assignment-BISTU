package top.flydinosaur.homeworks.homework_8_1.homework_8_1_3;
import java.util.Scanner;

public class Homework_8_1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CreditCardAccount creaditAccount = new CreditCardAccount(1, 2, 2);
        System.out.println("--------信用卡账户的初始信息---------\n" + creaditAccount.toString());
        creaditAccount.depoit(input.nextDouble());
        System.out.println("--------信用卡账户存款后的信息--------\n" + creaditAccount.toString());
        creaditAccount.withDraw(input.nextDouble());
        System.out.println("--------信用卡账户取款后的信息--------\n" + creaditAccount.toString());

        System.out.println("\n*********************************************\n");

        SavingsCard savingsCard = new SavingsCard(2, 2);
        System.out.println("--------储蓄卡账户的初始信息---------\n" + savingsCard.toString());
        savingsCard.depoit(input.nextDouble());
        System.out.println("--------储蓄卡账户存款后的信息--------\n" + savingsCard.toString());
        savingsCard.withDraw(input.nextDouble());

        System.out.println("--------储蓄卡账户取款后的信息--------\n" + savingsCard.toString());
    }
}

class Account{
    protected int id;
    protected double balance;

    public Account() {
        id = 0;
        balance = 0;
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public void depoit(double money){
        balance += money;
    }

    public void withDraw(double money){
        if (balance >= money){
            balance -= money;
        } else{
            System.out.println("余额不足");
        }
    }

    @Override
    public String toString(){
        return "账户\t" + id + "\t余额\t" + balance;
    }

}

class CreditCardAccount extends Account{
    private double creditCardLimit;

    public CreditCardAccount() {
        creditCardLimit = 5000;
    }

    public CreditCardAccount(int id, double balance, double creditCardLimit) {
        super(id, balance);
        this.creditCardLimit = creditCardLimit;
    }

    @Override
    public void withDraw(double money){
        if (money < (balance + creditCardLimit)){
            balance -= money;
        } else {
            System.out.println("余额不足");
        }
    }

    @Override
    public String toString(){
        return super.toString() + "\t额度\t" + creditCardLimit;
    }

}

class SavingsCard extends Account{
    public SavingsCard() {
    }

    public SavingsCard(int id, double balance) {
        super(id, balance);
    }

}