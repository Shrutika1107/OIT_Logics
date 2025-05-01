import java.util.Scanner;
public class DollarsInRs {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Dollars");   
        Double dollars=sc.nextDouble();
        Double rs=dollars*85.36;
        System.out.println("The Dollars " + dollars+  " in Rupees " + +rs); 
    }

    
}
