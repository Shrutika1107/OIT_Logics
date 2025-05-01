import java.util.Scanner;
public class RemainderQuotient
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Dividend:");
        int dividend=sc.nextInt();
        System.out.println("Enter the Divisor:");
        int divisor=sc.nextInt();

        int quotient=dividend/divisor;
        System.out.println("The quotient is:"+quotient);

        int remainder=dividend%divisor;
        System.out.println("The remainder is:"+remainder);
    }
}