import java.util.Scanner;
public class SphereArea
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of sphere:");
        Double radius = sc.nextDouble();
        Double Area=4*3.14*radius*radius;
        System.out.println("Area of circle is: "+Area);


    }
}