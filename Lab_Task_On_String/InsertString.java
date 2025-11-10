package Lab_Task_On_String;

import java.util.Scanner;

public class InsertString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String first_line = input.nextLine();

        System.out.print("Enter the second string: ");
        String second_line = input.nextLine();

        System.out.print("Enter the index to insert the string: ");
        int index = input.nextInt();

        for (int i = 0; i < first_line.length(); i++) {
            System.out.print(first_line.charAt(i));

            if (i == index - 1)
                System.out.print(second_line);
        }

        input.close();
    }
}
