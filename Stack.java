public class Stack {
    int[] stack;
    int capacity;
    int top;

    public Stack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int value) {
        if (top==capacity-1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed to stack");
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        } else {
            return stack[top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        } else {
            return stack[top];
        }
    }
    public int size(){
        return top+1;
    }
}

class Implementation {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(5);
        stack.push(20);
        System.out.println("Total number of elements in stack is :"+stack.size());
        System.out.println("The top value is " + stack.peek());
        stack.pop();
        stack.pop();
        System.out.println("The top value is " + stack.peek());
        System.out.println("Checking wether stack is empty or not: "+stack.isEmpty());
        System.out.println("Total number of elements in stack is :"+stack.size());
        
    }
}
