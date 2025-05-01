import java.util.Scanner;
public class SalaryCal{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter basic salary");
    Double basicSalary=sc.nextDouble();
    Double HRA=basicSalary*0.20;
    Double TA =basicSalary*0.10;
    Double DA =basicSalary*0.15;
    Double grossSalary=basicSalary+HRA+TA+DA;
    System.out.println("Basic salary:"+basicSalary);
    System.out.println("TA:"+TA);
    System.out.println("DA:"+DA);
    System.out.println("gross salary:"+grossSalary);
    

}
}
