package Task;

class Employee {
    void work() {
        System.out.println("Employee is working");
    }

    double getSalary() {
        return 50000.0;
    }
}

class HRManager extends Employee {
    
    void work() {
        System.out.println("HR Manager is recruiting and managing employee relations");
    }
}

public class Main2 {
    public static void main(String[] args) {
        HRManager hr = new HRManager();
        hr.work();                           // Overridden method
        System.out.println("Salary: " + hr.getSalary());  // Inherited method
    }
}

