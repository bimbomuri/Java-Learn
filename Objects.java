
// import libraries
import java.util.*;

//define a class 
class Methods {
    String name;
    int Age;

    // define a method
    void ageGame() {
        System.out.println("Your name is " + name + " and you are " + Age + " years old");

    }
}

public class Objects {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name: ");
        String Name = sc.nextLine();
        System.out.println("How old are you? ");
        int age = sc.nextInt();

        Methods object = new Methods();
        object.name = Name;
        object.Age = age;
        object.ageGame();
    }

}
