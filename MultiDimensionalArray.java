//MultiDimensional Array in Java
public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] multiDimensionalArray = { { 12, 34, 78, 90 }, { 67, 0, 45, 68 }, { 79, 23, 46, 93, 56 },
                { 94, 52, 01, -45 } };
        // System.out.println(multiDimensionalArray[3][3]);

        for (int array = 0; array < multiDimensionalArray.length; array++) {
            for (int values = 0; values < multiDimensionalArray[array].length; values++) {
                // print not println because i don't want each value on a new line.
                System.out.print(multiDimensionalArray[array][values] + "\t");
            }
            System.out.println();
        }
    }

}
