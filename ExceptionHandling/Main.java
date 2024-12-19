package  ExceptionHandling;
class InvalidAgeException extends Exception {
    // Constructor that accepts a custom message
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Main {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {
        try {
            validateAge(15);  // This will throw the custom exception
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
