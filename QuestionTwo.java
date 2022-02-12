
//Take three numbers from the user and print the greatest number
import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int aValue = sc.nextInt();
        System.out.println("Enter the second number: ");
        int bValue = sc.nextInt();
        System.out.println("Enter the third number: ");
        int cValue = sc.nextInt();
        System.out.printf("The 3 numbers you entered are: %d,%d,%d ", aValue, bValue, cValue);

        System.out.println(" ");

        if ((aValue > bValue) && (aValue > cValue)) {
            System.out.printf("%d is the greatest number of the three", aValue);
        } else if ((bValue > aValue) && (bValue > cValue)) {
            System.out.printf("%d is the greatest number of the three", bValue);
        } else {
            System.out.printf("%d is the greatest number of the three", cValue);
        }
    }

}
