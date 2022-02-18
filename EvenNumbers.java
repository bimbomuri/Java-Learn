
/* Write a method named isEven that accepts an int argument. 
The method should return true if the argument is even, or false otherwise. 
Also write a program to test your method.*/
import java.util.*;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an even number: ");
        int n = sc.nextInt();
        Numbers evenT = new Numbers();
        evenT.a = n;
        System.out.println(evenT.isEven(n));

    }
}

class Numbers {
    int a;

    boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
