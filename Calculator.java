import java.util.Scanner;

class Sum
{
   public Sum(int a,int b)
   {
     System.out.println("sum is: "+(a+b));
   }
}
class Multiply
{
   
    void multi(int a,int b)
    {
        System.out.println("multiply is: "+(a*b));
    }
}
public class Calculator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b= sc.nextInt();
        Sum s = new Sum(a,b);
        Multiply m = new Multiply();
        m.multi(a,b);

    }    
}