import java.util.Scanner;
public class Seconds
{
    public static void main(String args[])
    {
       
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a Hrs:");
    int hrs = Scanner.nextInt();
    System.out.print("Enter a Min:");
    int min = Scanner.nextInt();
    System.out.print("Enter a sec:");
    int sec = Scanner.nextInt();
    int totalSeconds=(hrs*3600)+(min*60)+sec;
    System.out.println("Total Seconds:"+totalSeconds);
    }
}
