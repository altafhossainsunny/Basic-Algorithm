import java.util.Arrays;
import java.util.Scanner;

public class FindingTheLowestandLargest {
    static int[] gettintheLowestandLargestvalue(int[]array){
//        int[] arr = new int[2];
//        arr[0] = array[0]; // Initialize with the first element of the array
//        arr[1] = array[0]; // Initialize with the first element of the array
//        for(int i = 1; i < array.length; i++) {
//            if(array[i] < arr[0]) {
//                arr[0] = array[i]; // Update minimum value
//            }
//            if(array[i] > arr[1]) {
//                arr[1] = array[i]; // Update maximum value
//                }
        Arrays.sort(array);
        int[] arr = {array [0], array[array.length -1]};

        return arr;
    }
    public static void main(String[]args){
        System.out.print("Enter the size of the array : ");
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int sizeOfArray = sc.nextInt();
        int[] array = new int[sizeOfArray];
        System.out.print("Now enter the "+sizeOfArray+ " elements :");
        for(int i = 0; i<array.length;i++){
            array[i] = sc.nextInt();
        }
        int[] array2 = gettintheLowestandLargestvalue(array);
        for(int j = 0;j<array2.length;j++)
            System.out.println("the highes and lowest value is "+array2[j]);
    }
}
