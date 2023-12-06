package GroupProject;

public class Task9 {
    // Write a java program to find the second-largest number in the array.
    public static void main(String[] args) {
        int[] num = {3, 91, 47, 43, 10, 8};

        int largest = num[0];
        int secondLargest = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                secondLargest = largest;
                largest = num[i];

            } else if (num[i] > secondLargest) {
                secondLargest = num[i];
            }
        }
        System.out.println("First largest number is " + largest);
        System.out.println("Second largest number is " + largest);
    }
}
