import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount ");
        double amt =sc.nextDouble();
        double discount=0;
        double discountRate=0;
        double discountAmt=0;
        if(amt>=10000)
        {
            discount=0.2;
            discountRate=amt*discount;
            discountAmt=amt-discount;
            System.out.println(discount);
        }
        else if(amt<=10000) 
        {
            discount =0.5;
            discountRate=amt*discount;
            discountAmt=amt-discount;
            System.out.println(discount);
        }
        else
        {
            System.out.println("No Discount");
        }
        }


    }

