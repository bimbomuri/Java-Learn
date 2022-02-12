import java.util.Scanner;

public class GettingUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int aValue = input.nextInt();

        System.out.println("Your line is: " + aValue);

    }

}
