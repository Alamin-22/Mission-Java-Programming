package Lab_Task_On_String;

import java.util.Scanner;

public class Concatenate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String first_line = input.nextLine();

        System.out.print("Enter the second string: ");
        String second_line = input.nextLine();

        System.out.println("First string : " + first_line);
        System.out.println("Second string : " + second_line);
        System.out.println("After concatenation : " + first_line.concat(second_line));

        input.close();
    }
}
