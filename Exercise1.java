import java.util.Scanner;

/**
 * 1. Write a Java program to get a number from the user and print whether it is positive or negative.

Test Data
Input number: 35
Expected Output :
Number is positive
 */

public class Exercise1{
    
    //@SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        
        try (//Allow users to enter any number: I/O
        Scanner input = new Scanner(System.in)) {
            System.out.print("Enter any number: ");
            int enteredNumber = input.nextInt();

            if (enteredNumber > 0){
                System.out.println("Entered number: "+ enteredNumber + " is positive" );
            }
            else {
                System.out.println("Entered number: " + enteredNumber + "is negative");
            }
        }

    }
}