package top.flydinosaur.homeworks.homework_4.homework_4_1.homework_4_1_2;

import java.util.Scanner;

public class Homework_4_1_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Loan loan = new Loan();
        loan.setAnnualInterestRate(scanner.nextDouble());
        loan.setNumberOfYears(scanner.nextInt());
        loan.setLoanAmount(scanner.nextDouble());

        System.out.println("贷款年利率是" + loan.getAnnualInterestRate());
        System.out.println("贷款总额是" + loan.getLoanAmount());
        System.out.println("贷款年限是" + loan.getNumberOfYears());
        System.out.println("月还款额是" + loan.getMonthlyPayment());
        System.out.println("还款总额是" + loan.getTotalPayment());

    }

}

class Loan{
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;

    public Loan(){
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getMonthRate(){
        double temp = annualInterestRate / 1200;
        return temp;
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, -numberOfYears * 12));
        return monthlyPayment;
    }

    public double getTotalPayment(){
        return getMonthlyPayment() * numberOfYears * 12;
    }

}