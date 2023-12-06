package GroupProject;

public class Task7 {
    // Write a Java Program to print the first 10 numbers of Fibonacci series.
    public static void main(String[] args) {
        int num=10;
        int num1=0;
        int num2=1;

        for (int i=1;i<=num;++i){
            System.out.print(num1+" ");

            int next= num1+num2;
            num1=num2;
            num2=next;
        }
    }}
