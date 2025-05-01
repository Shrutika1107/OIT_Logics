import java.util.Scanner;
public class MechanicalEnergy{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the mass");
Double mass =sc.nextDouble();
double gravity=9.81;
System.out.println("The gravity:"+gravity);
System.out.println("Enter the height:");
Double height=sc.nextDouble();
System.out.println("Enter the total velocity");
Double velocity=sc.nextDouble();
Double potentialEnergy=mass*height*gravity;
Double kineticEnergy=0.5*mass*velocity*velocity;
Double TotalEnergy =potentialEnergy+kineticEnergy;
System.out.println("Enter the total energy:"+TotalEnergy);

}
}
