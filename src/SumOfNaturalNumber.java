import java.util.Scanner;

public class SumOfNaturalNumber
{
    public static void main(String[] args)

    {
        //local variable
       int n,sum=0;
        Scanner scanner= new Scanner(System.in);    // create object of scanner class
        System.out.println("Enter Natural Number");  //taking a number input from user
        n = scanner.nextInt();                        //Getting input through object
        if(n>=0)                                       // condition to check if number is greater than or equal to zero
        {
            for (int i = 0; i <= n; i++)   //for loop to calculate sum of natural number
            {
                sum = sum + i;
            }
            System.out.println("sum of Natural number " + sum); //Print output
        }
        else
        {
            System.out.println("Invalid Number"); //Print output
        }
    }
}
