import java.util.Scanner;
public class MetreToKilometres
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value in meter:");
        Double kilometer=sc.nextDouble();
        Double meter = kilometer/1000;
        System.out.println(kilometer+"meters is equal to "+meter+" Kilometer");
    }
    

 }
