public class Swapping3
{
    public static void main(String args[])
    {
       
       int a=10;
    int b=20;
    System.out.print("before swapping: a="+a+",b="+b);
    
    a=a^b;
    b=a^b;
    a=a^b;
   
    System.out.println("After swapping:a="+a+",b="+b);
    }
}