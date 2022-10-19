import java.util.Scanner;

public class SumOfFirstAndLastDigit
{
    public static void main(String[] args)
    {
        {
            Scanner sc=new Scanner(System.in);

            //taking a number input from user
            System.out.println("Enter a number: ");
            int number = sc.nextInt();
            //storing the number value in a temporary variable say 'temp'
            int temp=number;
            //declaring two integer variable firstDigit and lastDigit
            //and initializing both with value as 0
            int firstDigit=0;
            int lastDigit=0;

            //find last digit of number
            lastDigit=number%10;

            //continue the loop till the number becomes 0
            //inside loop variable 'firstDigit' will give the first digit at the end of while loop
            while(number!=0)   //checking condition in while loop
            {
                int rem = number%10; //divide the input number by 10 to get remainder
                firstDigit=rem;
                number= number/10;   //changing the value of input number to get previous number
            }
            System.out.println("Number is: "+temp);
            System.out.println("First digit of number: "+ firstDigit );
            System.out.println("Last digit of number: "+ lastDigit);
            System.out.println("Sum of first and last digit of number: "+ (firstDigit+lastDigit));
        }


    }
}
