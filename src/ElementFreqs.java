import java.util.Scanner;

public class ElementFreqs {
    public static int CommonOccurance(int arr[], int index1, int index2, int element) {
        int count = 0;
        for (int i = index1; i < index2; ++i) {
            if (arr[i] == element)
                ++count;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {10, 220, 50, 1, 20, 900, 20, 1, 12};
        int end = arr.length;
        System.out.println("Home assignment 2 by Munira Tabassum: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Index: ");
        int first = sc.nextInt();
        System.out.println("Enter last Index: ");
        int last = sc.nextInt();

        if (first <= 8 && last <= 8) {
            System.out.println("Enter number to check in array between " + first + " and " + last);
            int number = sc.nextInt();
            sc.close();
            System.out.println("Your array is:");
            for (int j : arr) {
                System.out.println(j);
            }
            System.out.println("Frequency of " + number + " between " + first + " to " + last + " in this array =" + CommonOccurance(arr, first, last, number));
        } else {
            System.out.println("Please enter your index between valid range:[0-8] ");
        }
    }
}
