import java.util.Scanner;

public class FactorialNumber
{
    public static void main(String[] args)
    {
        //local variable
      int n,fact=1;
        Scanner scanner=new Scanner(System.in);// create object of scanner class
        System.out.println("Enter number"); // taking a number from user
        n = scanner.nextInt();//Getting input through object

        for(int i=1; i<=n; i++) //use for loop condition
        {
         fact =fact*i;

        }
        System.out.println("Factorial "+ fact);

    }



}
