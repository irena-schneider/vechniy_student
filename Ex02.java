import java.util.Scanner;

public class Ex02 {
    public static void main (String []args){
        Scanner input = new Scanner (System.in);
        int number, firstDigit, secondDigit, lastDigit, length;
        do{
            System.out.println("Enter a three-digit integer:" );
            number = input.nextInt();
            length = String.valueOf(number).length();
        }
        while (length != 3);
        firstDigit = number / 100;
        secondDigit = firstDigit % 10;
        lastDigit = number % 100;
        if (firstDigit == lastDigit){
            System.out.println(number + " is a palindrom ");
        }
        else {
            System.out.println(number + " is not a palindrom");
        }
        do {
            System.out.println("Enter a three-digit number : ");
            number = input.nextInt();
            length = String.valueOf(number).length();
        }
        while (length != 3);
        firstDigit = number / 100;
        lastDigit = number % 10;
    }
}

