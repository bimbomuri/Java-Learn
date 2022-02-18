
/*
 * Write a program to print the area of a rectangle by creating a class named
 * 'Area' having two methods.
 * First method named as 'setDim' takes length and breadth of rectangle as
 * parameters and
 * the second method named as 'getArea' returns the area of the rectangle.
 * Length and breadth of rectangle are entered through keyboard.
 */
import java.util.*;

class AreaRectangles {
    int length;
    int breadth;

    void getArea() {
        int Area = length * breadth;
        System.out.println("The area of the rectangle is: " + Area);
    }

}

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle");
        int breadth = sc.nextInt();

        AreaRectangles area = new AreaRectangles();
        area.length = length;
        area.breadth = breadth;
        area.getArea();

    }
}