import java.util.Scanner;
public class Main { // class BirthMonth
    public static void main(String[] args) { // main()
        // Create a Scanner object to get user input
        Scanner in = new Scanner(System.in);
        // num birthMonth

        // Prompt the user to enter their birth month
        System.out.print("Enter your birth month (1 - 12): "); // output "Enter your birth month (1-12):"

        if (in.hasNextInt()) {
            int birthMonth = in.nextInt(); // input birthMonth

            // Check if the entered value is in the range 1 to 12
            if (birthMonth >= 1 && birthMonth <= 12) { // if birthMonth birthMonth > = 1 and birthMonth < = 12 then
                System.out.println("Your birth month is: " + birthMonth); // output “Your birth Month is: “ + birthMonth
            } else {
                System.out.println("You entered an incorrect month value: " + birthMonth); //output “You entered an incorrect month value: “ + birthMonth
            }
        } else {
            // Input is not an integer
            System.out.println("You did not enter a valid integer.");
        } // endif
    } // return
} // end class





