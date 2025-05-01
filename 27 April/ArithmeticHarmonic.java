import java.util.Scanner;

public class ArithmeticHarmonic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of A:");
        int a=sc.nextInt();
        System.out.println("Enter the value of B");
        int b=sc.nextInt();
        int am=a+b/2;
        int hm=2*a*b/(a+b);
        System.out.println("The Arithmetic mean is:"+am);
        System.out.println("The harmonic mean is:"+hm);
    }
}
