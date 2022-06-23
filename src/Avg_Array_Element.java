public class Avg_Array_Element {
    public static void main(String[] args) {
        //A Java program to calculate the average value of array elements.

        int[] Marks = {11, 17, 23, 35, 44, 53, 65, 72};
        //calculate the sum of all array elements
        int sum = 0;
        for (int mark : Marks) sum = sum + mark;
        //calculate average value
        double average = sum / Marks.length;
        System.out.println("The sum of the numbers in the array = " + sum);
        System.out.println("The length of the array = " +  Marks.length);
        System.out.println("The average value of the array elements = " + average);
    }
}
