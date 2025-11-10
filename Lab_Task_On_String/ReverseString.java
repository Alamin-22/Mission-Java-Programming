package Lab_Task_On_String;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String line = input.nextLine();
        int len = line.length();

        char[] reversed_line = new char[len];

        for (int i = 0; i < len; i++) {
            reversed_line[len - i - 1] = line.charAt(i);
        }

        System.out.println("Initial string; " + line);
        System.out.print("Reversed string: ");
        System.out.println(reversed_line);

        input.close();
    }
}
