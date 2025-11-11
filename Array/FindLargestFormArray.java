package Array;

/* 
 * find out the Largest & Smallest element from a given array. int[] inputArr = {43,27,10,98,75,191,40, 70};
 */
public class FindLargestFormArray {

    public static void main(String[] args) {

        int[] takenArray = { 43, 27, 10, 98, 75, 191, 40, 70 };

        int maxValue = findLargest(takenArray);
        int minValue = findSmallest(takenArray);

        System.out.println("THis is the Maximum Value => " + maxValue);
        System.out.println("THis is the Minimum Value => " + minValue);

    }

    public static int findLargest(int[] numbers) {
        int maxValue = numbers[0];

        for (int num : numbers) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }

    public static int findSmallest(int[] numbers) {
        int minValue = numbers[0];

        for (int num : numbers) {
            if (num < minValue) {
                minValue = num;
            }
        }
        return minValue;
    }

}