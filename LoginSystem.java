import java.io.Console;

public class LoginSystem {
    // Constants for authentication - This section Encapsulates sensitive credentials
    private final String ADMIN_USER = "admin";
    private final String ADMIN_PASS = "password123";
    private final int MAX_ATTEMPTS = 3;

    public boolean startLogin() {
        Console console = System.console();
        
        // Check if environment supports secure console input
        if (console == null) {
            System.out.println("No system console found. Please run in a terminal.");
            return false;
        }

        // Loop to provide exactly 3 attempts as per assignment requirements
        for (int i = 1; i <= MAX_ATTEMPTS; i++) {
            System.out.println("\n--- Login Attempt " + i + " of " + MAX_ATTEMPTS + " ---");
            
            // Accept username entry
            System.out.print("Username: ");
            String inputUser = console.readLine();

            // Accept password entry - Console.readPassword() provides the '*' masking effect
            System.out.print("Password: ");
            char[] passwordChars = console.readPassword();
            String inputPass = new String(passwordChars);

            // Conditional logic to verify credentials
            if (inputUser.equals(ADMIN_USER) && inputPass.equals(ADMIN_PASS)) {
                System.out.println("Authentication Successful! Accessing System...");
                return true; // Return true to trigger the main application
            } else {
                // Feedback for incorrect entry
                System.out.println("Invalid credentials. Please try again.");
            }
        }

        // Final lockout message after 3 failed entries
        System.out.println("\n[ACCESS DENIED] Maximum attempts reached. System locked.");
        return false;
    }
}