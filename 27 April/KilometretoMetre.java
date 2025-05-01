import java.util.Scanner;
public class KilometretoMetre
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value in Kilometer:");
        Double kilometer=sc.nextDouble();
        Double meter = kilometer*1000;
        System.out.println(meter+"meters is equal to "+kilometer+" Kilometer");
    }
    

 }
