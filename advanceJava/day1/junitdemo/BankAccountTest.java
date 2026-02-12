import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    void testSuccessfulDeposit() {
        BankAccount acc = new BankAccount(100);
        acc.deposit(50);
        assertEquals(150, acc.getBalance(), 0.0001);
    }

    @Test
    void testInsufficientBalance() {
        BankAccount acc = new BankAccount(100);
        assertThrows(InsufficientBalanceException.class, () -> acc.withdraw(150));
        assertEquals(100, acc.getBalance(), 0.0001);
    }

    @Test
    void testNegativeDeposit() {
        BankAccount acc = new BankAccount(100);
        assertThrows(IllegalArgumentException.class, () -> acc.deposit(-10));
        assertEquals(100, acc.getBalance(), 0.0001);
    }

    @Test
    void verifyBalanceAfterOperations() {
        BankAccount acc = new BankAccount(200);
        acc.deposit(100); // 300
        acc.withdraw(40); // 260
        acc.withdraw(60); // 200
        assertEquals(200, acc.getBalance(), 0.0001);
    }
}
