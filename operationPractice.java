public class operationPractice {

    public static void main(String[] args) {
        int totalSecond = 315;
        int minute;
        double remainingSecond;

        minute = (totalSecond / 60);
        remainingSecond = (totalSecond % 60);

        System.out.println("Total second is => " + totalSecond + " \n And Here is the converted Minute => " + minute
                + " \n And here is the remainingSecond => " + remainingSecond);

    }

}