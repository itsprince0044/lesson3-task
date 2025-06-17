abstract class Payment {
    abstract void processPayment();
}

class CreditCard extends Payment {
    void processPayment() {
        System.out.println("Processing Credit Card payment...");
    }
}

class PayPal extends Payment {
    void processPayment() {
        System.out.println("Processing PayPal payment...");
    }
}

class BankTransfer extends Payment {
    void processPayment() {
        System.out.println("Processing Bank Transfer...");
    }
}
