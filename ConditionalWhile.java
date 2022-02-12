public class ConditionalWhile {

    public static void main(String[] args) {
        int amount = 0;
        while (true) {
            // System.out.println("In the loop");

            if (amount == 6) {
                break;
            }
            amount++;
            System.out.println("out of the loop");

        }
    }

}
