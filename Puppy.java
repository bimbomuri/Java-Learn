// Example to explain how to access instance variables and methods of a class
public class Puppy {
    int puppyAge;

    public Puppy(String name) {
        // This constructor has one parameter,name.
        System.out.println("Name Chosen is : " + name);

    }

    public void setAge(int age) {
        puppyAge = age;
    }

    public int getAge() {
        System.out.println("Puppy's age is : " + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {
        // object creation
        Puppy myPuppy = new Puppy("Abimbola");
        // call class method to set puppy's age
        myPuppy.setAge(2);
        // call another class method to get puppy's age
        myPuppy.getAge();
        // you can access instance variable as follows as well
        System.out.println("Variable value: " + myPuppy.puppyAge);
    }

}
