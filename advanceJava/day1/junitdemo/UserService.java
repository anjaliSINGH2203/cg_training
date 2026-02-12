public class UserService {

    public String registerUser(String username, String password) {
        if (username == null || username.trim().isEmpty()) {
            throw new InvalidUsernameException("Username cannot be null or empty");
        }
        if (password == null || password.length() < 8) {
            throw new WeakPasswordException("Password must be at least 8 characters");
        }
        return "User registered: " + username.trim();
    }
}

class InvalidUsernameException extends RuntimeException {
    public InvalidUsernameException(String message) { super(message); }
}

class WeakPasswordException extends RuntimeException {
    public WeakPasswordException(String message) { super(message); }
}
