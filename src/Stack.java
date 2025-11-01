public class Stack {
    private int[] stack;
    private int top;
    private int capacity;

    public Stack(int size) {
        capacity = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (top < capacity - 1) {
            stack[++top] = value;
        } else {
            throw new IllegalStateException("Stack is full");
        }
    }

    public int pop() {
        if (top >= 0) {
            return stack[top--];
        } else {
            throw new IllegalStateException("Stack is empty");
        }
    }

    public int peek() {
        if (top >= 0) {
            return stack[top];
        } else {
            throw new IllegalStateException("Stack is empty");
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int size() {
        return top + 1;
    }
}
