package Lists;

public class ArrayPrint2D {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3,4},
                {5, 6, 7,8},
                {9,10,11,12}
        };
        for (int i = 0; i < numbers.length; i++) { // Row loop
            for (int j = 0; j < numbers[i].length; j++) { // Column loop
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println(); // Move to the next line
        }
    }
}
