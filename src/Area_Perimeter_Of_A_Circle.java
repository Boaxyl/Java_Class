public class Area_Perimeter_Of_A_Circle {
    public static void main(String[] args) {
        //A Java program to print the area and perimeter of a circle.

        double radius = 7.5;
        double pi = 3.141592653589793238;

        //Area of a circle = pi * radius * radius
        double Area = (pi * (radius*radius));

        //Perimeter of a circle = 2 * pi * radius
        double Perimeter = (2*pi*radius);

        //print the result
        System.out.println("The Area of a circle with a radius of " + radius + " = " + Area + ".");
        System.out.println("The Perimeter of a circle with a radius of " + radius + " = " + Perimeter + ".");

    }
}
