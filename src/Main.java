import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter their birth month
        System.out.print("Enter your birth month (1 - 12): ");

        if (in.hasNextInt()) {
            int birthMonth = in.nextInt();

            // Check if the entered value is in the range 1 to 12
            if (birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("Your birth month is: " + birthMonth);
            } else {
                System.out.println("You entered an incorrect month value: " + birthMonth);
            }
        } else {
            // Input is not an integer
            System.out.println("You did not enter a valid integer.");
        }
    }
}





