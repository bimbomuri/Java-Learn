
// Write a Java method to count all words in a string.
import java.util.*;

class Method {
    String text;

    void getText(String text) {
        System.out.printf("There are %d characters in the text", text.replace(" ", "").length());
        String[] words = text.split("\\s+");
        System.out.printf(" and %d words in the text", words.length);

    }
}

public class StringCounter {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a String: ");
            String input = sc.nextLine();
            Method method = new Method();
            method.text = input;
            // System.out.println(input);
            method.getText(input);
        }
    }

}
