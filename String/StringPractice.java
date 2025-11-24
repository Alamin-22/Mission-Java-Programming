package String;

import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args) {

        Scanner scannerObj = new Scanner(System.in);

        String savedUserName = "javaDev25";
        String userInput;

        System.out.print("Enter the User name => ");
        userInput = scannerObj.nextLine();

        boolean lengthCheck = userInput.length() > 6;
        System.out.print("User Provided a Strong UserName which has more than 6 character" + lengthCheck);

        boolean spaceCheck = !userInput.contains(" ");

        System.out.println("Does NOT contain spaces? " + spaceCheck);

        boolean matchCheck = savedUserName.equals(userInput);

        System.out.println("Matches saved username? " + matchCheck);

        if (lengthCheck && spaceCheck && matchCheck) {
            System.out.println("--- Validation SUCCESS ---");
        } else {
            System.out.println("--- Validation FAILED ---");

        }
    }

}
