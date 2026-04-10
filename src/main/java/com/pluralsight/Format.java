package com.pluralsight;

import java.util.Scanner;

public class Format {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name:");
        System.out.print("Enter your first name here: ");
        String first=input.nextLine();
        System.out.print("Enter your last name here: ");
        String last=input.nextLine();
       String call=formatName(last,first);
        System.out.println(call);

    }
    public static String formatName(String first, String last){
        String  message = ", how is your day?";
        return first + ", " + last + message;
    }
}
