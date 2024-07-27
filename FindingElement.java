import java.util.*;
public class FindingElement {
    static void lastOccurence(int x, int[]array){
        int lastOccur = 0;
        for(int k = 0; k<array.length; k++){
            if(array[k]==x){
                lastOccur = (k);
            }
        }
        System.out.println("The last occurance of the "+x+" is: "+lastOccur+"th element");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array ");
        int n = sc.nextInt();
        System.out.println();
        int[] array = new int[n];
        System.out.println("Enter the "+n+" elements");
        for(int i = 0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
        System.out.print("Enter which element you want to find ");
        int x = sc.nextInt();
        int sum = 0;
        for(int j = 0; j<array.length; j++){
            if(array[j]==x){
                sum++;
            }
        }
        System.out.println();
        System.out.println("The number of times "+x+" forund is "+sum);
        lastOccurence(x, array);
        Graternum(x,array);
        boolean shorted = checkShorted(array);
        if(shorted == true){
            System.out.println("This is a shorted array ");
        }else {
            System.out.println("This is an unshorted array ");
        }
        switch (x){
            case 1:
                System.out.println(x);
                break;
            case 2:
                System.out.println(x);
                break;
            case 3:
                System.out.println(x);
                break;
        }
    }
    static void Graternum(int x , int[]array){
        int count = 0;
        for(int l = 0; l<array.length; l++){
            if(array[l]>x){
                count++;
            }
        }
        System.out.println(count+" elements are greater then "+x);
    }
    static boolean checkShorted(int[]array){
        boolean check = false;
        for(int m = 1; m<array.length; m++){
            if(array[m-1]<array[m]){
                check=true;
            }
            return check;
        }
        return check;
    }
}
