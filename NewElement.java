
//Write a Java Program to remove a particular element from an array. 
//solution
// import libraries
import java.util.*;

//class name
public class NewElement {
    // global scanner object sc
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many elements do you want to enter? ");
        int n = sc.nextInt();
        String[] myIntArray = new String[n];

        System.out.println("Enter the  element(s) in the array: ");
        for (int i = 0; i < n; i++) {
            String userInput = sc.next();
            myIntArray[i] = userInput;
        }
        for (String names : myIntArray) {
            System.out.println(names);
        }
        System.out.println("Which number of element will you like to remove? ");
        int numRemove = sc.nextInt();
        String[] myNewIntArray = removeTheElement(myIntArray, numRemove);
        System.out.println(Arrays.toString(myNewIntArray));
    }

    public static String[] removeTheElement(String[] arr, int index) {
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }

        String[] anotherArray = new String[arr.length - 1];

        // Copy the elements from starting till index
        // from original array to the other array
        System.arraycopy(arr, 0, anotherArray, 0, index);

        // Copy the elements from index + 1 till end
        // from original array to the other array
        System.arraycopy(arr, index + 1, anotherArray, index, arr.length - index - 1);

        // return the resultant array
        return anotherArray;
    }

}
