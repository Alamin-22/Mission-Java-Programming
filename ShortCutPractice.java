public class ShortCutPractice {

    // Goal: Use a for loop and shortcuts to find the sum of all even numbers from 1
    // to 100.

    public static void main(String[] args) {

        int sumOfEvenNumber = 0;

        for (int i = 1; i <= 100; i++) {
            int value = (i % 2 == 0) ? i : 0;
            sumOfEvenNumber += value;
        }

        System.out.println("This is the result of Total Sum of All Even Number  => " + sumOfEvenNumber);

    }

}