public class Stack {

    private int capacity;
    private int size;
    private int[] elements;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.elements = new int[this.capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int element) {
        if(size == capacity)
            throw new Overflow();

        elements[size++] = element;
    }

    public int getSize() {
        return size;
    }

    public int pop() {
        if(size == 0)
            throw new Underflow();
        return elements[--size];
    }

    public static class Overflow extends RuntimeException {
    }

    public static class Underflow extends RuntimeException {
    }
}
