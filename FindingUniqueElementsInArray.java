import java.util.Scanner;

public class FindingUniqueElementsInArray {
    static void UniqueArrayDetection(int[] Array) {
        int count = 0;
        boolean test = true;
        for (int i = 0; i < Array.length; i++) {
            for (int j = i + 1; j < Array.length; j++) {
                if (Array[i] == Array[j]) {
                    test = false;
                    Array[i] = -1;
                    Array[j] = -1;
                }
            }
        }
        for (int k = 0; k < Array.length; k++) {
            if (Array[k] > 0) {
                System.out.println("The unique elements in this array is : " + Array[k]);
                count++;
            }
        }System.out.println("The number of unique elements in the given array is : " + count);
    }


    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the Array : ");
        int n = sc.nextInt();
        int[]array=new int[n];
        System.out.println("Enter the "+n+" element");
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        UniqueArrayDetection(array);
    }
}
