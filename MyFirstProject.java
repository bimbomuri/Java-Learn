public class MyFirstProject {
    // this constructor has one parameter,name
    public MyFirstProject(String name) {
        System.out.println("Passed Name is : " + name);
    }

    public static void main(String[] args) {
        // Following statement would create an object mProject
        MyFirstProject mProject = new MyFirstProject("Abimbola");
    }
}
