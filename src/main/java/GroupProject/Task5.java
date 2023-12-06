package GroupProject;

public class Task5 {
    /*
    Write a program to swap 2 numbers without a temporary variable.
     */
    public static void main(String[] args) {
        int num = 1;
        int num2 = 2;

        num = num+num2;
        num2 = num-num2;
        num = num-num2;

        System.out.println(num);
        System.out.println(num2);
    }}
