package com.pluralsight;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check is it's even: ");
        int number = input.nextInt();
        if (isEven(number)) {
            System.out.println("It is even.");
        } else if (!(isEven(number))) {
            System.out.println("It is odd.");
        }
        isPositive(number);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void isPositive(double number) {
        if (number > 0) {
            System.out.println("It is positive");
        } else {
            System.out.println("It is negative");
        }
    }
}
