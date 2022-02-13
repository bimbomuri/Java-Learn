
//Write a program in Java to print from 1 to 10 but quit if multiple of 7 is encountered
import java.util.*;

public class DoWhile {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a range of numbers: ");
        int Counter = 1;

        do {
            System.out.println(Counter);
            if (Counter % 7 == 0) {
                System.out.println("Multiple of 7 encountered. Quitting loop!");
                break;
            }
            Counter++;
        } while (Counter <= 10);

    }
}
