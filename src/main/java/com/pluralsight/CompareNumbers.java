package com.pluralsight;
import java.util.Scanner;
public class CompareNumbers {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number to check is it's even: ");
    int number=input.nextInt();
    System.out.println(isEven(number));
    }
    public static boolean isEven(int number){
       if(number%2==0){
           System.out.println("It is even");
           return true;
       }
        System.out.println("It isn't");
        return false;
    }
}
