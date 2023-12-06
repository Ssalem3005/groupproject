package GroupProject;

public class Task3 {
    /*
    Create a 2D array or integer type where you will store odd and even
numbers. Develop a program which will identify/print the even numbers
only.
     */
    public static void main(String[] args) {
        int[][] numbers = {
                {13, 42, 68, 7},
                {10, 41, 82, 1},
                {6, 44, 72, 33},
        };
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.print(numbers[i][j] + " ");
                }
            }
        }
    }
}
