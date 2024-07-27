import java.util.Scanner;
public class FindingTheSecondSmallestElement {
    static int GettingTheSecondSmallestNumber(int[]array){
        int min = Integer.MAX_VALUE;
        int secondmin = Integer.MAX_VALUE;
        for(int i = 0; i<array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        for(int j=0; j< array.length;j++){
            if(array[j]==min){
                array[j]= Integer.MAX_VALUE;
            }
        }
        for(int k = 0; k<array.length;k++){
            if(secondmin>array[k]){
                secondmin = array[k];
            }
        }
        return secondmin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();
        System.out.println();
        int[]Array = new int[n];
        System.out.print("Enter the "+n+" elements now :");
        for(int i = 0;i<Array.length;i++){
            Array[i]=sc.nextInt();
        }
        int min_value = GettingTheSecondSmallestNumber(Array);
        System.out.println("The second Minimum value is : "+min_value);
    }
}
