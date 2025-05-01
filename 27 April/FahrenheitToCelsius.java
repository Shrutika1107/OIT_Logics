import java.util.Scanner;
public class FahrenheitToCelsius
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the temp in Fahrenheit:");
        Double Fahrenheit =sc.nextDouble();

        Double Celcius =(Fahrenheit-32)*5/9;
        System.out.println("Temprature in celcius"+Celcius);
    }
}