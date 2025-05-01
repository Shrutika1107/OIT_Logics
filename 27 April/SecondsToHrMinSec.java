import java.util.Scanner;

public class SecondsToHrMinSec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         
        System.out.println("Enter the sec");
         int Sec=sc.nextInt();

         int hours=Sec/3600;
         int min=(Sec%3600)/60;
         int Seconds =((Sec%3600)%60);

         System.out.println("Hours:"+hours+"hrs");
         System.out.println("Minutes"+min+"min");
         System.out.println("Seconds"+Seconds+"sec");
    
}
}
