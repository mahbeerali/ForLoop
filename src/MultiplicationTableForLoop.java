import java.util.Scanner;

public class MultiplicationTableForLoop
{
    public static void main(String[] args)
    {
       //local number
       int num;
        Scanner scanner=new Scanner(System.in);  // create object of scanner class
        System.out.println("Enter any Number");  //taking a number input from user
        num = scanner.nextInt();                 //getting input through object

        for (int i=1; i<=10 ;i++)    // for loop
        {
            System.out.println(num+"*" +i+ "=" +num*i); //print output

        }

    }


}
