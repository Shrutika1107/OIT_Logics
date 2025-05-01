import java.util.Scanner;
public class CoOrdinateDistance
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the x1:");
        Double x1 =sc.nextDouble();

        System.out.println("Enter the x2:");
        Double x2 =sc.nextDouble();

        System.out.println("Enter the y1:");
        Double y1 =sc.nextDouble();

        System.out.println("Enter the y2:");
        Double y2 =sc.nextDouble();

        Double distance =Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("The distance between to points"+distance);
    }
}