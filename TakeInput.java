import java.util.Scanner;

public class TakeInput {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter Your name => ");

        String Name = scanner.nextLine();

        System.out.println(Name);

    }

}