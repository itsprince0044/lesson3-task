import java.util.Scanner;

public class CallCenterQueue {
    private String[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    // Constructor
    public CallCenterQueue(int size) {
        queue = new String[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    // a. Add an incoming call
    public void addCall(String callInfo) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot accept more calls.");
        } else {
            rear = (rear + 1) % capacity;
            queue[rear] = callInfo;
            count++;
            System.out.println("Incoming call from '" + callInfo + "' added to the queue.");
        }
    }

    // b. Handle the next call
    public String handleNextCall() {
        if (isEmpty()) {
            System.out.println("No calls to handle.");
            return null;
        } else {
            String call = queue[front];
            front = (front + 1) % capacity;
            count--;
            return call;
        }
    }

    // c. Display current queue
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("No calls in the queue.");
        } else {
            System.out.print("Current Call Queue: ");
            for (int i = 0; i < count; i++) {
                System.out.print(queue[(front + i) % capacity]);
                if (i < count - 1) System.out.print(" <- ");
            }
            System.out.println();
        }
    }

    // d. Get number of pending calls
    public int getPendingCallCount() {
        return count;
    }

    // Helper: Check if queue is full
    private boolean isFull() {
        return count == capacity;
    }

    // Helper: Check if queue is empty
    private boolean isEmpty() {
        return count == 0;
    }

    // e. Main method for menu-driven interaction
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CallCenterQueue queue = new CallCenterQueue(5); // queue size = 5

        while (true) {
            System.out.println("\n📞 Call Center Queue System");
            System.out.println("1. Add Incoming Call");
            System.out.println("2. Handle Next Call");
            System.out.println("3. Display Current Call Queue");
            System.out.println("4. Display Number of Pending Calls");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter caller's name/ID: ");
                    String caller = scanner.nextLine();
                    queue.addCall(caller);
                    break;
                case 2:
                    String served = queue.handleNextCall();
                    if (served != null) {
                        System.out.println("Handled call from: " + served);
                    }
                    break;
                case 3:
                    queue.displayQueue();
                    break;
                case 4:
                    System.out.println("Pending calls: " + queue.getPendingCallCount());
                    break;
                case 5:
                    System.out.println("Exiting Call Center Queue System.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1-5.");
            }
        }
    }
}
