package com.houarizegai.datastructure.stack;

public class StackDemo {
    public static void main(String[] args) {
        // Stack array
        System.out.println("Stack array");
        StackArray<Integer> stackArray = new StackArray<>(4);
        stackArray.push(1);
        stackArray.push(2);
        System.out.println(stackArray.pop());
        stackArray.push(4);

        System.out.println(stackArray.pop());
        System.out.println(stackArray.pop());

        // Stack array dynamic
        System.out.println("Stack array dynamic");

        StackArrayDynamic<Integer> stackArrayDynamic = new StackArrayDynamic<>();
        stackArrayDynamic.push(10);
        stackArrayDynamic.push(12);

        System.out.println(stackArrayDynamic.pop());
        System.out.println("size: " + stackArrayDynamic.size());
        stackArrayDynamic.push(7);

        System.out.println(stackArrayDynamic.pop());
        System.out.println(stackArrayDynamic.pop());
        System.out.println("size: " + stackArrayDynamic.size());

        // Stack linked list
        System.out.println("Stack linked list");
        StackLinkedList<Integer> stackLinkedList = new StackLinkedList<>();
        stackLinkedList.push(10);
        stackLinkedList.push(3);

        System.out.println("size: " + stackLinkedList.size());
        System.out.println(stackLinkedList.pop());
        System.out.println("size: " + stackLinkedList.size());
        System.out.println(stackLinkedList.pop());

    }
}
