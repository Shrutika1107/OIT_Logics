import java.util.Scanner;
public class LiterToMilliiter
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value in litres:");
        Double litres =sc.nextDouble();
        Double millilitres = litres*1000;
        System.out.println(litres+"litres is equal to"+millilitres+"millilitres");
    }
    

 }
