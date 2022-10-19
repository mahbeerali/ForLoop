import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {

        //local variable
        int n,count=0;

        Scanner scanner = new Scanner(System.in);// create object of scanner class
        System.out.println("Enter  any number");//taking a number input from user
        n = scanner.nextInt();                  //Getting input through object

        for (int i = 1; i <= n; i++)   // Loop to divide number by all the numbers less than user input number
        {

           if(n%i==0)
           {
            count++;

           }

        }
        if(count==2)
            System.out.println("Prime Number"); //Prime number is divisible by one and itself

        else
            System.out.println("Not Prime Number");
    }

}
