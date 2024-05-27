package top.flydinosaur.experiments.experiment_1.experiment_1_2;

import java.util.Scanner;

public class Experiment_1_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack testStack = new Stack();
        for (int i = 0; i < 6; i++) {
            testStack.push(scanner.nextInt());
        }
        System.out.println("弹出的栈顶元素是" + testStack.pop());
        System.out.println("栈顶元素是" + testStack.peek());
        while (testStack.size() != 0){
            System.out.print(testStack.pop() + " ");
        }
    }
}

class Stack{

    public static final int DEFAULT_CAPACITY = 5;
    private int size;
    private int[] element;

    public Stack(){
        this.element = new int[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public Stack(int capacity){
        this.element = new int[capacity];
        this.size = 0;
    }

    public boolean empty(){
        if (size == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public int peek(){
        return element[size - 1];
    }
    public void push(int value) {
        if (size < element.length){
            element[size] = value;
            size++;
        }
        else {
            int[] tempArray = new int[element.length * 2];
            System.arraycopy(element, 0, tempArray, 0, element.length);
            element = tempArray;
            element[size] = value;
            size++;
        }
    }

    public int pop(){
        int temp = element[size - 1];
        size--;
        element[size] = 0;
        return temp;
    }

    public int size(){
        return size;
    }
}