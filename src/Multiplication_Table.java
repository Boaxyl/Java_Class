import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {

        //prints enter a number between 1 - 12 to the console
        System.out.println("Enter a number between 1 and 12");
        //Get an input from user, convert to an integer to manipulate the data
        Scanner Get = new Scanner(System.in);
        int number = Get.nextInt();

        //Loop declaration, system should loop through value to print out the product of the value and the entered number and stops once value is less than 11
        int value = 1;

            while (value<11)
            {
            //Prints out the multiplication table of the entered value to the 10th place.
            System.out.println(number + " x " + value + " = " + (number * value));
            value++;
        }

    }
}
