import java.util.Scanner;

public class DoWhileLoop
{
    public static void main(String[] args)
    {
        //local variable
        int row, colum;
        Scanner scanner = new Scanner(System.in);// create object of scanner class
        System.out.println("Enter row length");
        row = scanner.nextInt();                 //getting input through object
        System.out.println("Enter colum height");
        colum = scanner.nextInt();               //getting input through object
        int i = 1;
        do
        {   int j=1;
            do
            {
                System.out.print(i * j + "\t");
                  j++;
             } while (j <= colum);
           i++;
           System.out.println();
        }
        while(i<= row);


    }
}
