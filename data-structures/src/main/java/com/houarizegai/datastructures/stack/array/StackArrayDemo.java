package com.houarizegai.datastructures.stack.array;

public class StackArrayDemo {
    public static void main(String[] args) {
        System.out.println("Stack array");
        StackArray<Integer> stackArray = new StackArray<>(4);
        stackArray.push(1);
        stackArray.push(2);
        System.out.println(stackArray.pop());
        stackArray.push(4);

        System.out.println(stackArray.pop());
        System.out.println(stackArray.pop());
    }
}
