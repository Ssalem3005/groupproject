package GroupProject;

public class Task8 {
    // Find the maximum and minimum number in the array.
    public static void main(String[] args) {
        int[] num={7,11,2,99,60,77};
        int max=num[0];
        int min=num[0];

        for (int i=1;i<num.length;i++){
            if (num[i]>max){
                max=num[i];
            }
            if (num[i]<min){
                min=num[i];
            }
        }
        System.out.println("The largest number is "+max);
        System.out.println("The smallest number is "+min);
    }}
