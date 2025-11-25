package Practice;

import java.util.Scanner;

/* 

check is the given number  is palindrome or not
a number that reads the same forwards and backward

*/

public class Palindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String originalString = "";

        System.out.print("\n Please write anything to check is this a palindrome or not =>  ");

        originalString = scanner.nextLine();

        if (isPalindrome(originalString)) {
            System.out.println("The given string is Palindrome ");
        } else {
            System.out.println("The given string is not Palindrome ");
        }

    }

    public static boolean isPalindrome(String originalString) {

        String reversedString = "";

        int originalStrLength = originalString.length();

        for (int i = originalStrLength - 1; i >= 0; i--) {
            reversedString += originalString.charAt(i);
        }

        if (originalString.equals(reversedString)) {
            return true;
        } else {
            return false;
        }

    }

}