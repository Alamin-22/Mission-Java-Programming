package Lab_Task_On_String;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String line = input.nextLine();
        int len = line.length();

        for (int i = 0; i <= len / 2; i++) {
            if (line.charAt(i) != line.charAt(len - i - 1)) {
                System.out.println("string is not a palindrome");
                return;
            }
        }

        System.out.println("String is a palindrome");

        input.close();
    }
}
