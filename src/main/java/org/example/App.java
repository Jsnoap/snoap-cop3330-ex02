package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        String inputGiven;
        int length;

        System.out.println("What is the input string?");
        Scanner input = new Scanner(System.in);
        inputGiven = input.next();

        length = inputGiven.length();
        System.out.println(inputGiven + " has " + length + " characters.");
    }
}
