public class BankAccount {
    private double balance;

    public BankAccount() {
        this(0.0);
    }

    public BankAccount(double initialBalance) {
        if (initialBalance < 0) throw new IllegalArgumentException("Initial balance cannot be negative");
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Deposit amount cannot be negative");
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Withdraw amount cannot be negative");
        if (amount > balance) throw new InsufficientBalanceException("Insufficient balance");
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
