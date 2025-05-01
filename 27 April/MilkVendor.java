import java.util.Scanner;
public class MilkVendor
{
    public static void main(String args[])
    {
       
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a milk in liter:");
    int milk = scanner.nextInt();
    int water = milk/4;
    
    Double milkCost = milk*28.5;
    
    int processedMilk=milk+water;
    
    Double SalesCost=processedMilk*58.20;
    
    Double profit = SalesCost-milkCost;
    System.out.println("The Gain is:"+profit+"Rs.");
    }
}