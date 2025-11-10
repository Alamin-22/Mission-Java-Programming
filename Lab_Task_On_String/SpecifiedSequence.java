package Lab_Task_On_String;

import java.util.Scanner;

public class SpecifiedSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String line = input.nextLine();

        System.out.println("Enter the sequence: ");
        String sequence = input.nextLine();

        if (line.contains(sequence)) {
            System.out.println("the sequence is in the string.");
        } else {
            System.out.println("the sequence is not in the string.");
        }

        input.close();
    }
}
