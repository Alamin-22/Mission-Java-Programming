package Practice;

public class CopyArray {

    public static void main(String[] args) {
        int[] originalArray = { 10, 20, 30, 40, 50 };

        int[] newArray = new int[originalArray.length];


        
        for (int i = 0; i < originalArray.length; i++) {

            newArray[i] = originalArray[i];

        }

        System.out.println("\n here is the Original Array below : ");
        for (int item : originalArray) {
            System.out.print(item + " ");
        }

        System.out.println("\n here is the Copy newArray below : ");
        for (int item : newArray) {
            System.out.print(item + " ");
        }

    }

}
