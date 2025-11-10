package Lab_Task_On_String;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String first_line = input.nextLine().toLowerCase();

        System.out.print("Enter the second string: ");
        String second_line = input.nextLine().toLowerCase();

        char[] first = first_line.toCharArray();
        char[] second = second_line.toCharArray();

        sort_char(first);
        sort_char(second);

        if (first.length != second.length) {
            System.out.println("NOT ANAGRAM");
            return;
        }

        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                System.out.println("NOT ANAGRAM");
                return;
            }
        }

        System.out.println("IS ANAGRAM");

        input.close();
    }

    public static char[] sort_char(char[] line) {

        for (int i = 0; i < line.length; i++) {
            for (int j = i; j < line.length; j++) {
                if (line[i] > line[j]) {
                    char temp = line[i];
                    line[i] = line[j];
                    line[j] = temp;
                }
            }
        }

        return line;
    }
}
