import java.util.*;

public class SecondLargestNum {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many numbers will you like to find ? ");
        int n = sc.nextInt();
        int[] myIntArray = getIntegers(n);
        printArray(myIntArray);
        Arrays.sort(myIntArray);
        System.out.println("The Second Largest in the Array is : " + myIntArray[myIntArray.length - 2]);

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter your " + number + " numbers: ");
        int intArray[] = new int[number];
        for (int i = 0; i < number; i++) {
            intArray[i] = sc.nextInt();
        }
        return intArray;

    }

    // print array function
    public static void printArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
