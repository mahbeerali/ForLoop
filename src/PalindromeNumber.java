import java.util.Scanner;

public class PalindromeNumber
{
   public static void main(String[] args)
   {
       int n,s=0,c,r;
       Scanner scanner= new Scanner(System.in); //create object of scanner class
       System.out.println("Enter  any number");  //taking a number input from user
       n =scanner.nextInt();      //Getting input through object
       c=n;                          //initialize c
       while(n>0)   //checking condition in while loop

       {
           r=n%10;  //divide the input number by 10 to get remainder
           s=(s*10)+r;
           n=n/10;  //changing the value of input number to get previous number
       }
         if (c==s)
            System.out.println("Palindrome Number"); //print output

         else
            System.out.println("Not Palindrome Number"); //print output



   }






}
