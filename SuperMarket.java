import java.util.Scanner;

public class SuperMarket {
    private String[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    // Constructor
    public SuperMarket(int size) {
        queue = new String[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    // Add a customer to the queue
    public void enqueue(String customer) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot add more customers.");
        } else {
            rear = (rear + 1) % capacity;
            queue[rear] = customer;
            count++;
            System.out.println(customer + " has joined the queue.");
        }
    }

    // Serve the next customer
    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! No customer to serve.");
            return null;
        } else {
            String served = queue[front];
            front = (front + 1) % capacity;
            count--;
            return served;
        }
    }

    // Display all customers in the queue
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("The queue is currently empty.");
        } else {
            System.out.print("Current queue: ");
            for (int i = 0; i < count; i++) {
                System.out.print(queue[(front + i) % capacity]);
                if (i < count - 1) System.out.print(" <- ");
            }
            System.out.println();
        }
    }

    // Get the current number of customers
    public int getSize() {
        return count;
    }

    // Check if queue is full
    public boolean isFull() {
        return count == capacity;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return count == 0;
    }

    // Main method to simulate the system
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SuperMarket queue = new SuperMarket(5); // queue of 5 capacity

        while (true) {
            System.out.println("\nSupermarket Queue Management System");
            System.out.println("1. Add Customer to Queue");
            System.out.println("2. Serve Next Customer");
            System.out.println("3. Display Queue");
            System.out.println("4. Display Number of Customers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    queue.enqueue(name);
                    break;
                case 2:
                    String served = queue.dequeue();
                    if (served != null) {
                        System.out.println("Served: " + served);
                    }
                    break;
                case 3:
                    queue.displayQueue();
                    break;
                case 4:
                    System.out.println("Number of customers in queue: " + queue.getSize());
                    break;
                case 5:
                    System.out.println("Exiting system. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please select between 1 and 5.");
            }
        }
    }
}

