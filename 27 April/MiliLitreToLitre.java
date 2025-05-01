import java.util.Scanner;
public class MiliLitreToLitre
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value in MiliLitre:");
        Double MiliLitrelitres =sc.nextDouble();
        Double litres = MiliLitrelitres/1000;
        System.out.println(MiliLitrelitres+"Mililitres is equal to"+litres+"litres");
    }
    

 }
