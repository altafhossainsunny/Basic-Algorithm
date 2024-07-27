import java.util.Scanner;
public class FindingTheSecondLargestNumber {
    static int TheSecondlargest(int[]array){
        int FirstLargestValue = Integer.MIN_VALUE;
        int SecondLargestValue =  Integer.MIN_VALUE;
        for (int k =0;k<array.length;k++) {
            if (FirstLargestValue < array[k]) {
                FirstLargestValue = array[k];
            }
        }
        for(int j=0; j<array.length;j++){
            if(array[j]==FirstLargestValue){
                array[j]=Integer.MIN_VALUE;
            }
        }
        for (int i=0; i<array.length;i++) {
            if (SecondLargestValue < array[i]) {
                SecondLargestValue = array[i];
            }
        }
        return SecondLargestValue;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int [] Array = new int[n];
        System.out.println();
        System.out.print("Enter the "+n+" element : ");
        for(int i = 0;i<Array.length;i++){
            Array[i] = sc.nextInt();
        }
        int Secondlar = TheSecondlargest(Array);
        System.out.println("The second largest number in the given array is : "+Secondlar);
    }
}
