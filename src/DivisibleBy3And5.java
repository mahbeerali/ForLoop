import java.util.Scanner;

public class DivisibleBy3And5
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);            // create object of scanner class
        System.out.println("Enter the start number");          //taking a start number input from user
        int a = scanner.nextInt();                             //reads iNumber from users
        System.out.println("Enter the  end number");             //taking a end number input from user
        int b = scanner.nextInt();
        int c = 3;
        int d = 5;
        System.out.println("Number divided by 3 is:");

        for (int i = a; i <= b; i++)
        {
            if (i % c == 0)                        //condition to check if number divisible by 3
            {
                System.out.println(i);

            }
        }
            System.out.println("\nNumber Divisible by 5 :");  //condition to check if number divisible by 5
            for(int j=a;j<=b;j++)
            {
                if (j % d == 0)
                {
                    System.out.println(j);

                }
            }


    }


}

