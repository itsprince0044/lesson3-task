class Account {
    double balance;
    Account(double balance) { this.balance = balance; }

    double calculateInterest() {
        return balance * 0.03;
    }
}

class SavingsAccount extends Account {
    SavingsAccount(double balance) { super(balance); }
    double calculateInterest() {
        return balance * 0.04;
    }
}

class FixedDepositAccount extends Account {
    FixedDepositAccount(double balance) { super(balance); }
    double calculateInterest() {
        return balance * 0.06;
    }
}
