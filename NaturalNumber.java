import java.util.*;

public class NaturalNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range of natural numbers you want: ");
        int aNatural = in.nextInt();
        int i = 0;
        int sum = 0;

        for (i = 1; i <= aNatural; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.printf("The sum of %d natural numbers is %d", aNatural, sum);

    }

}
