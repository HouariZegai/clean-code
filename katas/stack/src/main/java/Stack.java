public interface Stack {
    boolean isEmpty();

    void push(int element);

    int getSize();

    int pop();

    int top();

    int find(int element);

    class Overflow extends RuntimeException {
    }

    class Underflow extends RuntimeException {
    }

    class IllegalCapacity extends RuntimeException {
    }

    class Empty extends RuntimeException {
    }
}
