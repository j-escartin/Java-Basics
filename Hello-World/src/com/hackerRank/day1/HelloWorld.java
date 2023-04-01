package com.hackerRank.day1;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        //Call the scanner class
        Scanner scan = new Scanner(System.in);

        //Reading a line of input and store it in a variable
        String inputString = scan.nextLine();

        //Close the scanner class
        scan.close();

        //Print Hello World in the first line
        System.out.println("Hello World!");

        //Print the input string
        System.out.println(inputString);

    }

}
