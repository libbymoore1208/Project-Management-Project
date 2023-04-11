import java.util.Scanner;

public class LoginSystem 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username, password;
        
        System.out.println("Welcome to the Login System!");
        System.out.print("Enter your username: ");
        username = scanner.nextLine();
        System.out.print("Enter your password: ");
        password = scanner.nextLine();
        
        // Validate the username and password
        if (validateLogin(username, password)) {
        System.out.println("Login successful!");
        } else {
        System.out.println("Invalid username or password. Please try again.");
        }
        
        scanner.close();
        }
        
        public static boolean validateLogin(String username, String password) {
        
        String validUsername = "myusername";
        String validPassword = "mypassword";
        
        return username.equals(validUsername) && password.equals(validPassword);
        }
}
