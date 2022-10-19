import java.util.Scanner;

public class FibonacciSeries
{
    public static void main(String[] args)

    {   int n,
        a=1,b=1,c;   //Local variable
        Scanner scanner=new Scanner(System.in);                // create object of scanner class
        System.out.println("Enter fibonacci series for limitation n"); //taking a number input from user
        n = scanner.nextInt(); //scanner method

        for(int i=1; i <= n; i++) //For loop
        {
          System.out.println(a+""); //enter first number of fibonacci series
          c=a+b;
          a=b;
          b=c;

        }

    }


}
