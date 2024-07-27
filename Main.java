import java.util.Scanner;
import java.util.Arrays;
public class Main{
    static void printArray(int[]arr){
     for(int i = 0; i<arr.length; i++){
         System.out.print(arr[i] + " ");
     }
        System.out.println();
    }
    static void changeArray(int[]array){
        for(int i = 0; i<array.length; i++){
            array[i] = 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n  = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " +n+ " elements");
        for(int i = 0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Original Array");
        printArray(array);

        int[] array2 = Arrays.copyOfRange(array,0, array.length);
        System.out.println("Copied Array");
        printArray(array2);

        array2 [0] = 3;
        array2 [1] = 4;
        System.out.println("Changes in copied Array ");
        printArray(array2);

        System.out.println("Changes in the main Array");
        printArray(array);
        System.out.println("The value is changing into 0 in array2");
        changeArray(array2);
        printArray(array2);
        System.out.println("Observint the changes in the main Array");
        printArray(array);
    }
}