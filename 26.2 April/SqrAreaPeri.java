import java.util.Scanner;4
public class SqrAreaPeri
{
    public static void main(String args[]) 
    {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius of square:");
        int a =sc.nextInt();

        int area = a*a;
        int perimeter=4*a;

        

        System.out.println("perimeter of square:"+perimeter);
        System.out.println("Area of square:"+area);


    }
}