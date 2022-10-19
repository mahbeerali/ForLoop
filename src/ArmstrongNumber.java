import java.util.Scanner;

public class ArmstrongNumber
{
    public static void main(String[] args)
    {
       int n,arm=0,rem,c;                          //local variable
       Scanner scanner = new Scanner(System.in);   // create object of scanner class
       System.out.println("Enter  any number");   //taking a number input from user
       n =scanner.nextInt();                      //Getting input through object
       c=n;                                       //initialize c
        while(n>0)
        {

            rem=n%10;                            //divide the input number by 10 to get remainder

            arm=(rem*rem*rem)+arm;               //calculating power
            n=n/10;                             //Changing the value of input number

        }
          if (c==arm)                           //Condition to check if number is armstrong or not
              System.out.println("Armstrong Number");     //print output
          else
              System.out.println("Not Armstrong number"); //Print output
    }


}
