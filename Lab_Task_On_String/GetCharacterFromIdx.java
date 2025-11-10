package Lab_Task_On_String;

import java.util.Scanner;

public class GetCharacterFromIdx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String line = input.nextLine();

        System.out.print("Enter the index of the character you want to get: ");
        int index = input.nextInt();

        System.out.println("your string: " + line);

        System.out.println("Character at index " + index + " is: " + line.charAt(index - 1));

        input.close();
    }
}
