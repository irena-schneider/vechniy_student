package com.company;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


            System.out.println("Enter an integer: ");
          int  number = input.nextInt();

    System.out.println(number + (isPalindrom(number) ? "is " : " is not")+ " an polindrom.");

    }

    public static boolean isPalindrom(int number) {
        return number == reverse(number) ? true : false;
    }

    private static int reverse(int number) {
        String reverse = ""; //ask
        String n = number +"";

        for (int i=n.length() -1; i >=0; i--){
            reverse += n.charAt(i);
        }
        return Integer.parseInt(reverse);

    }
}
