import java.util.Scanner;
public class GrossSalary
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Basic Salary:");
        Double baseSalary =sc.nextDouble();
        Double da=0.40*baseSalary;
        Double hra=0.20*baseSalary;
        Double grossSal=da+hra;
        System.out.println("The Gross Salary of Rajesh is:"+grossSal);
    }
}