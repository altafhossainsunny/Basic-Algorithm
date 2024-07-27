import java.util.Scanner;

public class InplaceArrayReverse {
    static void ReversedArray(int[]array){
        int i = 0,j=array.length-1;
        int temp;
        while(i<j){
            temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            j--;
            i++;
        }
        System.out.print("Now the reversed array is :");
        for(int k=0;k< array.length;k++){
            System.out.printf("%d ",array[k]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[]Array = new int[n];
        System.out.print("Now enter "+n+" elements :");
        for(int i=0;i< Array.length;i++){
            Array[i]= sc.nextInt();
        }
        ReversedArray(Array);
    }
}
