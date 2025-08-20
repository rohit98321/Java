import java.util.Scanner; // Import Scanner for input

public class UserInput {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // Create Scanner object
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // Take string input
        
        System.out.println("Hello, " + name + "!"); // Print the input
        
        sc.close(); // Close the scanner
    }
}
