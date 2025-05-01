import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        char num=sc.next().charAt(0);

        System.out.println("The number is "+num);
        System.out.println("The ASCII is"+(int) num);

    }
    
}
