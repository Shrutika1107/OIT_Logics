import java.util.Scanner;
import java.util.function.DoubleUnaryOperator;

public class KineticPotenEner {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the mass");
        Double mass=sc.nextDouble();
        Double gravity=9.81;
        System.out.println("The gravity:"+gravity);
        System.out.println("Enter the height");
        double height =sc.nextDouble();
        System.out.println("Enter the total velocity");
        Double velocity =sc.nextDouble();
        Double PotentialEnergy=mass*gravity*height;
        System.out.println("potential energy is:"+PotentialEnergy);
        Double kineticEnergy=0.5*mass*velocity*velocity;
        System.out.println("kinetic energy is:"+kineticEnergy);
    }
 }
