import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    @Test
    void testValidRegistration() {
        UserService service = new UserService();
        String result = service.registerUser("Anjali", "StrongPass1");

        assertAll(
                () -> assertNotNull(result),
                () -> assertTrue(result.contains("Anjali")),
                () -> assertTrue(result.startsWith("User registered"))
        );
    }

    @Test
    void testInvalidUsername() {
        UserService service = new UserService();
        assertThrows(InvalidUsernameException.class, () -> service.registerUser("   ", "StrongPass1"));
        assertThrows(InvalidUsernameException.class, () -> service.registerUser(null, "StrongPass1"));
    }

    @Test
    void testWeakPassword() {
        UserService service = new UserService();
        assertThrows(WeakPasswordException.class, () -> service.registerUser("Anjali", "123"));
        assertThrows(WeakPasswordException.class, () -> service.registerUser("Anjali", null));
    }
}
