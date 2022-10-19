import java.util.Scanner;

public class SumOfEachDigit
{


    public static void main(String[] args)
    {
        //local variable
        int n, r, sum = 0;
        Scanner scanner = new Scanner(System.in);    // create object of scanner class
        System.out.println("Enter 5 digit number"); //taking a number input from user
        n = scanner.nextInt();

        while (n > 0)      //checking condition in while loop
        {
            r = n % 10;    //divide the input number by 10 to get remainder
            sum = sum + r;
            n = n / 10; //changing the value of input number to get previous number
        }
        System.out.println("Sum of digits " + sum); //printing output

    }
}