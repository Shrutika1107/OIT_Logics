import java.util.Scanner;

public class Intrest
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter principle amount:");
        Double principle=sc.nextDouble();
        System.out.print("Enter rate of Intrest:");
        Double rate=sc.nextDouble();
        System.out.print("Enter the time:");
        Double time=sc.nextDouble();
        Double SimpleIntrest=(principle*rate*time)/100;
        Double CompoundIntrest=principle*Math.pow(1+rate/100,time)-principle;
        System.out.println("simple Intrest:"+SimpleIntrest);
        System.out.println("compound Intrest"+CompoundIntrest);

    }
}