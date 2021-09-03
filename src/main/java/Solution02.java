/*
 *  UCF COP3330 Fall 2021 Assignment1 Solution for Pb2
 *  Copyright 2021: Praween Pongpat
 */

import java.util.Scanner;

public class Solution02 {
    /*
        print (prompt) for string input "What is the input string?"
        'string' = read string from user
        'len' = find length of 'string' using .length class
        print output "'string' has 'len' characters"
     */

    public static void main(String[] args) {        //beginning main method

        System.out.print("What is the input string? ");                 //prompt user to get input

        Scanner input = new Scanner(System.in);                         //create input from Scanner class
        String string = input.nextLine();                               //create 'string' for reading from user

        int len = string.length();                                      //determine 'len' for length of the string

        System.out.println(string + " has " + len + " characters.");    //print output using 'string' and 'len'
    }                                               //end of main method
}
