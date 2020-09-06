import java.util.Scanner;

public class ElementFreqs {

    public static void main(String[] args) {
        System.out.println("Home assignment 2 by Munira Tabassum: ");

        int[] numbers = {30, 57, 93, 15, 31, 30, 49, 16, 30, 93};
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Starting Index (0 to " + (numbers.length - 1) + "): ");
        int start = input.nextInt();
        System.out.println("Enter Ending Index (0 to " + (numbers.length - 1) + "): ");
        int end = input.nextInt();

        if (end < numbers.length && end > start) {
            System.out.println("Enter number to check between indices " + start + " and " + end);
            int number = input.nextInt();
            input.close();

            System.out.println("Items in the array: ");
            for (int j : numbers) {
                System.out.println(j);
            }
            System.out.println();
            System.out.println(ElementFrequency(numbers, start, end, number));
        } else {
            System.out.println("Enter a Valid range which is [0-" + numbers.length + "] ");
        }
    }

    public static String ElementFrequency(int[] arr, int startIndex, int endIndex, int item) {
        int count = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == item) {
                count = count + 1;
            }
        }
        return "Total number of times " + item + " appears between " + startIndex + " to " + endIndex + " is = " + count;
    }
}
