import java.util.Scanner;
public class SecondsToHMS
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sec:");
        Double sec =sc.nextDouble();

        Double Hour=sec/3600;
        System.out.println("The Total Hour is:"+Hour+"hrs");
    }
}