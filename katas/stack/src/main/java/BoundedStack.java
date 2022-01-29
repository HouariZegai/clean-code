public class BoundedStack implements Stack {

    private int capacity;
    private int size;
    private int[] elements;

    public static Stack getInstance(int capacity) {
        if(capacity < 0)
            throw new IllegalCapacity();
        if(capacity == 0)
            return new ZeroCapacityStack();

        return new BoundedStack(capacity);
    }

    private BoundedStack(int capacity) {
        this.capacity = capacity;
        this.elements = new int[this.capacity];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void push(int element) {
        if(size == capacity)
            throw new Overflow();

        elements[size++] = element;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int pop() {
        if(isEmpty())
            throw new Underflow();
        return elements[--size];
    }

    @Override
    public int top() {
        if(isEmpty())
            throw new Empty();

        return elements[size - 1];
    }

    @Override
    public int find(int element) {
        for(int i = size - 1; i >= 0; i--)
            if(elements[i] == element)
                return size - 1 - i;
        return -1;
    }

    public static class ZeroCapacityStack implements Stack {
        @Override
        public boolean isEmpty() {
            return true;
        }

        @Override
        public void push(int element) {
            throw new Overflow();
        }

        @Override
        public int getSize() {
            return 0;
        }

        @Override
        public int pop() {
            throw new Underflow();
        }

        @Override
        public int top() {
            throw new Empty();
        }

        @Override
        public int find(int element) {
            return -1;
        }
    }

}
