import java.util.Scanner;

public class OddEven5DigitNumber
{

    public static void main(String[] args)
    {
        int iNumber,singleDigit=0,sum=0, even= 0,odd=0,sum1=0,sum2=0; // declare local variable iNumber,singleDigit
        //declare and initialize variables odd,even,sum,sum1,sum2

        Scanner scanner = new Scanner(System.in); //Creating object of scanner class
        System.out.println("Enter 5 digit number");//taking a number input from user
        iNumber = scanner.nextInt(); //read iNumber from users
        if(iNumber>=10000&&iNumber<=99999)  //Restrict user to input 5-digit number

        {

            while (iNumber != 0)     //checking condition in while loop
            {
                int remainder = iNumber % 10;  //divide the input number by 10 to get remainder

                singleDigit = singleDigit * 10 + remainder;
                //to get the single digit which change in every iteration start from last digit then second last and s
                iNumber = iNumber / 10;//changing the value of input digit to get previous digit
                sum = sum + remainder; //calculating sum

                if (remainder % 2 == 0)
                {
                    even = even + 1;
                    sum1 = sum1 + remainder;
                } else {
                    odd = odd + 1;
                    sum2 = sum2 + remainder;
                }
            }
                System.out.println("Total Even Numbers are= " + even);
                System.out.println("Sum of  Odd Numbers are= " + odd);
                System.out.println("Sum of  Even Numbers are= " + sum1);
                System.out.println("Sum of  Even Numbers are= " + sum1);
                System.out.println("Sum of  odd Numbers are= " + sum2);

        }
        else
            {
                System.out.println("Please enter 5 digit number");
            }

    }
}








