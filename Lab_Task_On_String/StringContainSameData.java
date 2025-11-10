package Lab_Task_On_String;

import java.util.Scanner;

public class StringContainSameData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String first_line = input.nextLine();

        System.out.print("Enter the second string: ");
        String second_line = input.nextLine();

        if (first_line.equalsIgnoreCase(second_line)) {
            System.out.println("Both strings contains the same data.");
        } else
            System.out.println("Both strings does not contains the same data.");
        input.close();
    }
}
