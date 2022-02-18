
//import libraries
import java.util.*;

//class
public class AverageNum {
    // Scanner initilization
    public static Scanner sc = new Scanner(System.in);

    // main function
    public static void main(String[] args) {
        System.out.println("How many numbers do you want to find the average: ");
        int n = sc.nextInt();
        int[] myIntArray = getIntegers(n);
        printArray(myIntArray);
        System.out.println("The Average is :  " + getAverage(myIntArray));

    }

    // get integer function
    public static int[] getIntegers(int number) {
        System.out.println("Please Enter " + number + " integer values");
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

    // do the average math calculation
    public static double getAverage(int[] intArray) {
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        // double avg = ;
        return (double) sum / (double) intArray.length;
    }
}
