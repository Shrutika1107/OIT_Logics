import java.util.Scanner;
public class Marks
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of sub1");
        Double sub1=sc.nextDouble();
        System.out.println("Enter marks of sub2");
        Double sub2=sc.nextDouble();
        System.out.println("Enter marks of sub3");
        Double sub3=sc.nextDouble();
        System.out.println("Enter marks of sub4");
        Double sub4=sc.nextDouble();
        System.out.println("Enter marks of sub5");
        Double sub5=sc.nextDouble();  
        Double Total= sub1+sub2+sub3+sub4+sub5;
        Double per=(Total/500)*100;
        System.out.println("Total:"+Total);
        System.out.println("Percentage:"+per);
    }
}
