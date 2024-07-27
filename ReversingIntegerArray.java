import java.util.Scanner;
public class ReversingIntegerArray {
    static int[] ReversingProcess(int[]arr,int n){
        int[] array = new int[n];
        for(int i=0;i<arr.length;i++){
               array[i]=arr[arr.length-1-i];
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int n = sc.nextInt();
        int [] Array = new int[n];
        System.out.print("Enter "+n+" elements now : ");
        for(int i = 0; i<Array.length; i++){
            Array[i]=sc.nextInt();
        }
        int [] Reversed_Array = ReversingProcess(Array,n);
        System.out.print("The reversed array : ");
        for(int j = 0; j<Reversed_Array.length;j++){
            System.out.printf(" %d",Reversed_Array[j]);
        }
    }
}
