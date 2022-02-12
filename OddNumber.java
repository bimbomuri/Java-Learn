
/*  Write a program in Java to display the n terms of odd natural number and their sum. */
import java.util.*;

public class OddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of odd numbers: ");
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;
        for (i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                sum += i;
            }

        }

        System.out.printf("The sum is : %d", sum);
    }

}
