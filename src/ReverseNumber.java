import java.util.Scanner;

public class ReverseNumber
{
   public static void main(String[] args)
   {

       int n,rem; //local variable
       Scanner scanner=new Scanner(System.in); //Creating object of Scanner class
       System.out.println("Enter the 5 Digit Number"); //take from the user
       n = scanner.nextInt();

       while (n>0)
       {
         rem=n%10; // in the case of programming for digit extraction we use the modulus (%)
           System.out.println(rem); //Reverse order
           n=n/10; //we use the divisibility rule by 10

       }


   }
}
