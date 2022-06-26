import java.util.Arrays;
import java.util.Scanner;

public class Avg_Array_Element {
    public static void main(String[] args) {
        //A Java program to calculate the average value of array elements.

        System.out.println("Enter the length of the array :");
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        int [] Marks = new int[num];

        System.out.println("Enter the " + num + " numbers now");
        for (int i = 0; i < Marks.length; i++) {
            Marks[i] = input.nextInt();
        }
        System.out.println();System.out.println("These are the numbers you entered.");
        System.out.println(Arrays.toString(Marks));

        input.close();
        //calculate the sum of all array elements
        float sum = 0;
        for (int mark : Marks) sum = sum + mark;
        //calculate average value
        float average = sum / Marks.length;
        System.out.println("The sum of the numbers in the array = " + sum);
        System.out.println("The length of the array = " +  Marks.length);
        System.out.println("The average value of the array elements = " + average);
    }
}
