import java.util.Scanner;

public class InPlaceArrayRotation {

    static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    static void rotateArray(int[] array, int k) {
        int n = array.length;
        k = k % n; // To handle rotations greater than array length

        // Step 1: Reverse the entire array
        reverseArray(array, 0, n - 1);

        // Step 2: Reverse the first k elements
        reverseArray(array, 0, k - 1);

        // Step 3: Reverse the elements from k to end
        reverseArray(array, k, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.print("Now enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the steps for rotation: ");
        int steps = sc.nextInt();

        rotateArray(array, steps);

        System.out.print("The rotated array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
    }
}
