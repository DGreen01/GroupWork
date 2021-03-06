
import java.util.*;

public class Program7 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many elements are in the array");
        int n = input.nextInt();
        int[] array = new int[n];
        fill(array, n);

    }

    public static void fill(int[] array, int n) {
        System.out.println("Fill the array");
        Scanner input = new Scanner(System.in);
        array = new int[n];
        for (int x = 0; x < n; x++) {

            array[x] = input.nextInt();
        }
        average(array, n);
    }

    public static void average(int[] array, int n) {
        double sum = 0;
        for (int x = 0; x < n; x++) {
            sum = array[x] + sum;
        }
        double average = sum / n;
        System.out.println("The average is: " + average);
        print(array, n);
    }

    public static void print(int[] array, int n) {
        for (int x = 0; x < n; x++) {
            System.out.println("Array elements: " + array[x]);
        }
    }
}
