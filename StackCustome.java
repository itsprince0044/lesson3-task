public class StackCustome {
    int []stack;
    int capacity;
    int top;
    public StackCustome(int size){
        stack=new int[size];
        capacity=size;
        top=-1;

    }
    public boolean isEmpty(){
        return top== -1;
    }
    public boolean isFull(){
        return top==capacity-1;
    }
    public void push(int value){
        if(isFull()){
            System.out.println("Stack is overflow");
        }
        else{
            stack[++top]=value;
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -999999;
        }
        else{
            return stack[top--];
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -99999;
        }
        else{
            return stack[top];
        }
    }
}
class Implementations{
    public static void main(String[]args){
        StackCustome stack=new StackCustome(4);
        stack.push(10);
        stack.push(20);
        stack.push(340);
        System.out.println("Checking stack full or not: "+stack.isFull());
        System.out.println("Top element: "+stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.pop());
        System.out.println("Checking stack empty or not: "+stack.isEmpty());
    }
}
