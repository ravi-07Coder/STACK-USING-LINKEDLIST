package main;

import implementation.MyStack;

public class MyMain {
    public static void main(String[] args) {
        MyStack first=new MyStack();
        first.push(100);
        first.push(200);
        first.push(300);

        first.traverse();
        System.out.println(first.peek());
    }
}
