public class DoorWindow
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the dimensions of the cuboid and room:");
        System.out.println("Enter l:");
        Double l= sc.nextDouble();
        System.out.println("Enter b:");
        Double b= sc.nextDouble();
        System.out.println("Enter h:");
        Double h= sc.nextDouble();
        System.out.println("Enter the dimensions of the door:");
        
        System.out.print("Enter l:");
        Double l= sc.nextDouble();
        System.out.print("Enter b:");
        Double b= sc.nextDouble();
         System.out.println("Enter the dimensions of the Window:");
        System.out.print("Enter l:");
        Double l= sc.nextDouble();
        System.out.print("Enter b:");
        Double b= sc.nextDouble();

        Double cuboid =2*(l*b+b*h+h*l);
        Double door = dl*db;
        Double window = wl*wb;
        Double room=cuboid-door-window;
        System.out.println("The area of the room is:"+room+"sq.m");
    }
}