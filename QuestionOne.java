
// Write a Java program to get a number from the user and print whether it is positive or negative
import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int aNumber = input.nextInt();

        if (aNumber > 0) {
            System.out.println("The number is positive.");
        } else if (aNumber < 0) {
            System.out.println("The number is negative");

        } else {
            System.out.println("The number is zero.");
        }

    }

}
