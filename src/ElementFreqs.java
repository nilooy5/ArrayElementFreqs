import java.util.Scanner;

public class ElementFreqs {
    public static int ElementFrequency(int[] arr, int startIndex, int endIndex, int element) {
        int count = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == element)
            {
                count = count +1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Home assignment 2 by Munira Tabassum: ");
        int[] numbers = {30, 57, 93, 15, 31, 30, 49, 16, 30, 93};
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Starting Index (0 to " + (numbers.length-1) + "): ");
        int start = input.nextInt();
        System.out.println("Enter Ending Index (0 to " + (numbers.length-1) + "): ");
        int end = input.nextInt();

        if (start < numbers.length && end < numbers.length) {
            System.out.println("Enter number to check in array between " + start + " and " + end);
            int number = input.nextInt();
            input.close();
            System.out.println("Your array is:");
            for (int j : numbers) {
                System.out.println(j);
            }
            System.out.println();
            System.out.println("Total number of times " + number + " appears between " + start + " to " + end + " is = " + ElementFrequency(numbers, start, end, number));
        } else {
            System.out.println("Please enter your index between valid range:[0-8] ");
        }
    }
}
