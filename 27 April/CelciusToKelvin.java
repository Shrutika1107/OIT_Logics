import java.util.Scanner;

public class CelciusToKelvin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature in celcius");
        Double celcius =sc.nextDouble();
        Double kelvin=celcius+273.14;
        System.out.println("The celcius in kelvin is "+kelvin);
    }
}
