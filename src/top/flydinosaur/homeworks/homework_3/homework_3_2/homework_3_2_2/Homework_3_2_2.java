package top.flydinosaur.homeworks.homework_3.homework_3_2.homework_3_2_2;

import java.util.Scanner;

public class Homework_3_2_2 {

    public static void main(String[] a){

        Scanner input = new Scanner(System.in);

        int value = input.nextInt();

        String str= input.next();

        MyInteger myInteger=new MyInteger(value);

        System.out.println();

        System.out.println(myInteger.getValue()+"为奇数----> "+myInteger.isOdd());

        System.out.println(myInteger.getValue()+"为偶数----> "+myInteger.isEven());

        System.out.println(myInteger.getValue()+"为素数----> "+myInteger.isPrime());

        System.out.println();

        value = myInteger.parseInt(str);

        System.out.println(value+"为奇数----> "+myInteger.isOdd());

        System.out.println(value+"为偶数----> "+myInteger.isEven());

        System.out.println(value+"为素数----> "+myInteger.isPrime());

    }

    static class MyInteger{

        private int value;

        public MyInteger(int value){
            this.value = value;
        }

        public int getValue(){
            return this.value;
        }

        public boolean isEven(){
            if (this.value % 2 == 0){
                return true;
            }
            else {
                return false;
            }
        }

        public boolean isOdd(){
            if (this.value % 2 != 0){
                return true;
            }
            else{
                return false;
            }
        }

        public int parseInt(String str){
            this.value = Integer.parseInt(str);
            return Integer.parseInt(str);
        }

        public boolean isPrime(){
            int isPrimeJudge = 0;
            if (this.value <= 0){
                isPrimeJudge = 1;
            }
            else{
                for (int i = 2; i < this.value; i++){
                    if(this.value % i == 0){
                        isPrimeJudge = 1;
                    }
                }
            }

            if (isPrimeJudge == 1){
                return false;
            }
            else{
                return true;
            }

        }

    }

}


