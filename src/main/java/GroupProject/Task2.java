package GroupProject;

public class Task2 {
    /*Create an array of integer values. After the array is created, calculate the
sum of all stored elements in that array
     */
    public static void main(String[] args) {
        int[] arr={6,4,2,8,10};

        int sum=0;
        for(int num:arr)
        {sum+=num;}

        System.out.println("The sum equals " +sum);
    }}
