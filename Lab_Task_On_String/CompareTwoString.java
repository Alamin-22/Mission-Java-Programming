package Lab_Task_On_String;

import java.util.Scanner;

public class CompareTwoString {
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String first_line = input.nextLine().toLowerCase();

        System.out.print("Enter the second string: ");
        String second_line = input.nextLine().toLowerCase();

        int range = Math.min(first_line.length(), second_line.length());

        System.out.println("First string : " + first_line);
        System.out.println("Second string : " + second_line);

        for(int i = 0; i < range; i++){
            if((first_line.charAt(i) != second_line.charAt(i))){
                if(first_line.charAt(i) < second_line.charAt(i)){
                    System.out.println("First string is smaller"); return;
                }else {
                    System.out.println("Second string is smaller"); return;
                }
            }
        }

        if(first_line.length() < second_line.length()) System.out.println("First string is smaller");
        else if(first_line.length() > second_line.length()) System.out.println("Second string is smaller");
        else System.out.println("Both strings are equal");

        input.close();
    }
}
