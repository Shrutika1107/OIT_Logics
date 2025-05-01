import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the cost price");
        int cost =sc.nextInt();
        System.out.println("Enter the Selling price");
        
        double sellingprice=sc.nextDouble();
        double profitloss=sellingprice-cost;
        if(profitloss>0)
        {
            double profitpercentage=(profitloss/cost)*100;
            System.out.println("Profit:" +profitloss+"Rs");
            System.out.println("profitpercentage:" +profitpercentage);
        }
        else
        {
            double losspercentage=(-profitloss/cost)*100;
            System.out.println("profit"+(-profitloss)+"Rs");
            System.out.println("profit percentage"+losspercentage+"%");
        }

    }
}
