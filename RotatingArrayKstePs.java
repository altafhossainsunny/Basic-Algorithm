import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class RotatingArrayKstePs {
    static int[] RotatingArray(int[]array,int k){
        int length = array.length;
        k = k%length;
        int[]FinalArray=new int[length];
        int j=0;
        for(int i=length-k;i<length;i++){
            FinalArray[j++]= array[i];
        }
        for(int i=0;i<length-k;i++){
            FinalArray[j++]=array[i];
        }
        return FinalArray;
    }

    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] Array = new int[size];
        System.out.print("Now enter "+size+" elements : ");
        for(int i=0;i<Array.length;i++){
            Array[i]= sc.nextInt();
        }
        System.out.print("Enter the steps for rotation : ");
        int steps = sc.nextInt();
        int[]Rotated_array = RotatingArray(Array,steps);
        System.out.print("The final rotated Array :");
        for(int i = 0;i<Rotated_array.length;i++){
            System.out.printf("%d ",Rotated_array[i]);
        }
    }
}
