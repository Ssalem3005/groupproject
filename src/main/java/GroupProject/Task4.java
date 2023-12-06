package GroupProject;

public class Task4 {
    /*
    Create a 2D array of integers. Develop a program which will calculate the
sum of even and odd numbers for that array
     */
    public static void main(String[] args) {
        int[][] arrays = {
                {7,11,4},
                {10,22,81},
                {5,1,2}
        };
        int evenSum=0;
        int oddSum=0;

        for (int[]n:arrays){
            for(int i:n){
                if (i%2==0){
                    evenSum+=i;
                }else {
                    oddSum+=i;
                }
            }
        }
        System.out.println("The sum of even numbers is "+evenSum);
        System.out.println("The sum of odd numbers is "+oddSum);
    }
}
