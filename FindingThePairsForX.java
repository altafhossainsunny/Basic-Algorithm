import java.util.Scanner;
public class FindingThePairsForX {
    static void ThePair(int [ ]array, int x) {
        boolean found = false;
        int ans = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == x) {
                    System.out.printf("The pairs are" + "(" + array[i] + "," + array[j] + ")");
                    System.out.println();
                    found = true;
                    ans ++;
                }
            }
        }
        System.out.println("The number of pairs is :"+ans);
        if(!found){
            System.out.println("No pairs found");
        }
    }
    static void TheTriplates(int x, int[] array) {
        boolean found = false;
        int ans = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == x) {
                        System.out.printf("The triplates are" + "(" + array[i] + "," + array[j] + "," + array[k] + ")");
                        System.out.println();
                        found = true;
                        ans++;
                    }
                }
            }
        }
        System.out.println("The number of triplates is :" + ans);
        if (!found) {
            System.out.println("No triplates found");
        }
    }
    public static void main(String[]args){
        System.out.print("Enter the size of the Array :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] Array = new int[n];
        System.out.println();
        System.out.println("Enter the "+n+" elements");
        for(int k=0; k<Array.length;k++){
            Array[k]=sc.nextInt();
        }
        System.out.println("Now enter the number you want to find the sum :");
        int b = sc.nextInt();
        ThePair(Array,b);
        System.out.println();
        System.out.println();
        TheTriplates(b,Array);
    }
}
