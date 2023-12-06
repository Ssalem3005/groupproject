package GroupProject;

public class Task1 {
    /* Create a program that uses an array to store a list of temperatures for a week,
and then uses a loop to find the highest and lowest temperature for the week.

     */
    public static void main(String[] args) {
        int[] temp={41,40,51,47,54,56,51};

        int highestTemp=temp[0];
        int lowestTemp=temp[0];

        for(int temperature:temp){
            if(temperature>highestTemp){
                highestTemp=temperature;
            }if(temperature<lowestTemp){
                lowestTemp=temperature;
            }
        }
        System.out.println("The highest temperature for this week is "+highestTemp+" degrees F.");
        System.out.println("The lowest temperature for this week is "+lowestTemp+" degrees F.");
    }}
