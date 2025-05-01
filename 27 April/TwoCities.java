import java.util.Scanner;
public class TwoCities
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Distance Between Tow Cities:");
        Double twoCityDist =sc.nextDouble();
        Double metres =twoCityDist*1000;
        System.out.println("The Distance in metres"+metres);
        Double centimetres=twoCityDist*100000;
        System.out.println("The Distance in centimetres"+centimetres);
    }
}