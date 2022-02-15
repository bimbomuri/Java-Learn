
// Create a Java code to copy an Array into another array
import java.util.*;

public class CopyArray {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntArray = getIntegers(5);
        int[] newMyIntArray = Arrays.copyOf(myIntArray, myIntArray.length);
        System.out.println("Copied Array " + Arrays.toString(newMyIntArray));

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter the " + number + " number(s) in the array: ");
        int[] intArray = new int[number];
        for (int i = 0; i < number; i++) {
            intArray[i] = sc.nextInt();
        }
        return intArray;
    }
}
