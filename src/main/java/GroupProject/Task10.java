package GroupProject;

public class Task10 {
    // Write a program to print out duplicate elements from an Array of Strings.
    public static void main(String[] args) {
        String[] strings={"Cat", "Dog", "Fish", "Pig","Cat","Dog","Rabbit","Guinea Pig"};
        System.out.println("Duplicate elements in the array");

        for (int i=0;i<strings.length-1;i++){
            for (int j=i+1;j<strings.length;j++){
                if (strings[i].equals(strings[j])){
                    System.out.println(strings[j]);
                    break;
                }
            }
        }
    }
}
