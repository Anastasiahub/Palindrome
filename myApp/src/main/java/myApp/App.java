package myApp;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String inputNumber;
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter your number");
        while(!in.hasNext("[0-9]*"))
        {
            System.out.println("That's not a number");
            in.next();
        }
        inputNumber = in.next();

        Number number = new Number(inputNumber);
        OutputPalindrome outputPalindrome = new OutputPalindrome(number);
        outputPalindrome.printPalindrome();
    }
}
