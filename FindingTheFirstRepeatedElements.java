import java.util.Scanner;

public class FindingTheFirstRepeatedElements {static int GettingTheRepeatition(int[] arr){
    int index = Integer.MIN_VALUE;
    for(int i = 0; i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                index=i;
                return index;
            }
        }
    }
    return index;
 }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of the array :");
        n = sc.nextInt();
        int[] Array = new int[n];
        System.out.println();
        System.out.print("Enter " + n + " elements now : ");
        for (int l = 0; l < Array.length; l++) {
            Array[l] = sc.nextInt();
        }
        int index = GettingTheRepeatition(Array);
        if (index > -1) {
            System.out.println("The first repetitive element in the given array is: " + Array[index]);
        } else {
            System.out.println("There is no repetitive element is the given array");
        }
    }
}
