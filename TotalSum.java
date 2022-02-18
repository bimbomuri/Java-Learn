
/*Write a program with a method named getTotal that accepts two integers as an argument and return its sum. 
Call this method from main( ) and print the results.*/
import java.util.*;

public class TotalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        getTotal total = new getTotal();
        total.getTotal(a, b);
    }
}

class getTotal {
    int a;
    int b;

    void getTotal(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of the number you entered is : " + sum);
    }
}
