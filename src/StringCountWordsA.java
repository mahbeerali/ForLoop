import java.util.Scanner;

public class StringCountWordsA
{
    public static void main(String[] args)
    {
        //local variable
        String inputString;
        char occurrenceOfCharacter = 'a';
        int count=0;
        System.out.println("Enter the string:");   //taking a number input from user
        Scanner scanner = new Scanner(System.in); // create object of scanner class
        inputString =scanner.nextLine();           //Getting input through object

        for(int i=0;i<inputString.length(); i++)   // apply for loop
        {
           if (inputString.charAt(i) == occurrenceOfCharacter)
           {count++;} ////incrementing the value of count by 1
        }

        System.out.println("Total Number of 'a' in  the string "+ count); //print output

    }
}
