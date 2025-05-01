import java.util.Scanner;

public class AreaPerimOfRing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of outer ring");
        Double outerRadius=sc.nextDouble();
        System.out.println("Enter the radius of inner ring");
        Double innerRadius=sc.nextDouble();
        Double area=Math.PI*(outerRadius-innerRadius*innerRadius);
        Double perimeter=2*Math.PI*(outerRadius+innerRadius);
        System.out.println("The area of ring is:"+area);
        System.out.println("The perimeter of ring is:"+perimeter);
    }
}
