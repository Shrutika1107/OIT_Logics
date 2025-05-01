import java.util.Scanner;

public class TaxCalculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the basic Salary");
        double baseSalary=sc.nextDouble();
        System.out.println("Enter the gross Salary");
        double grossSal=sc.nextDouble();
        System.out.println("Enter the total Salary");
        double deduction=sc.nextDouble();
        double taxableInc=grossSal-deduction;
        double tax=0;
        
        if(taxableInc<=250000)
        {
            tax=(taxableInc-250000)*0.01;

        }
        else if(taxableInc<=500000)
        {
            tax=(taxableInc-500000)*0.5;
        }
        else if(taxableInc<=1000000)
        {
            tax=(taxableInc-1000000)*0.1;
        }
     }
}
