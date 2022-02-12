
/*Write a Java program that keeps a number from the user and generates an integer
between 1 and 7 and displays the name of the weekday.*/
import java.util.*;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7:  ");
        int aDay = sc.nextInt();

        System.out.println(getDayName(aDay));

    }

    // to get the name of the week
    public static String getDayName(int aDay) {
        String dayName = "";
        switch (aDay) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day ran";
        }
        return dayName;

    }

}
