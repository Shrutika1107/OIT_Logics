import java.util.Scanner;

public class SurfaceAreaofCylinder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Radius:");
        int rad =sc.nextInt();
        System.out.println("Enter the Height");
        int height =sc.nextInt();
        Double surfaceArea=2*3.14*rad*(rad+height);
        System.out.println("The surface area of cylinder is:"+surfaceArea);
    }
}
