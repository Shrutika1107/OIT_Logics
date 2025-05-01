import java.util.Scanner;
public class Demo
{
    public static void main(String args[])
    {
       
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter a:");
    double a =sc.nextInt();

    System.out.print("Enter b:");
    double b =sc.nextInt();

    System.out.print("Enter c:");
    double c =sc.nextInt();
    Double s=(a+b+c)/2.0;
   
    System.out.println("The semi-parameter is:"+s);
    Double area =Math.sqrt(s*(s-a)*(s-b)*(s-c));
    System.out.println("area:"+area+"sq.cm");
    }
}