import java.util.Scanner;

public class SurfaceAreaOfCuboid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Length");
        Double l=sc.nextDouble();
        System.out.println("Enter the Breadth");
        Double b=sc.nextDouble();
        System.out.println("Enter the Height");
        Double h=sc.nextDouble();

        Double surfaceArea=2*((l*b)+(b*h)+(h*l));
        System.out.println("The Surface Area of Cuboid is:"+surfaceArea);

    }
}
