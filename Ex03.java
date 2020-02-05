package com.company;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.nextLine();

        int vowels;
                int consonans;
        vowels = consonans = 0;
for (int i = 0; i < word.length(); i++)
{
    if (Character.isLetter(word.charAt(i))) {
        if(Character.toUpperCase(word.charAt(i)) == 'A' ||
                Character.toUpperCase(word.charAt(i)) == 'E' ||
                Character.toUpperCase(word.charAt(i)) == 'I' ||
                Character.toUpperCase(word.charAt(i)) == 'O' ||
                Character.toUpperCase(word.charAt(i)) == 'U'){
            vowels++;
        }

else
    consonans++;
    }



System.out.println("The quantity of vowels is: " +vowels);
    System.out.println("The quantity of consonants is: " +consonans);
}
    }
}
