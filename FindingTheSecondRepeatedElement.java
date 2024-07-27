import java.util.Scanner;
public class FindingTheSecondRepeatedElement {
    static int getting_The_RepeatedElemant(int[]array){
        for(int i=0;i<array.length; i++){
            for(int j = i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    return array[i];
                }
            }
        }
        return -1;
    }
    static int gettin_The_SecondRepeatedElement(int[]array){
        int secondRepeatedElement = getting_The_RepeatedElemant(array);
        if(secondRepeatedElement==-1){
            return -1;
        }
        for(int k = 0;k<array.length;k++){
            for (int l= k+1;l<array.length;l++){
                if(array[k]==array[l]&&array[k]!=secondRepeatedElement){
                    return array[k];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();
        int [] Array = new int[n];
        System.out.println();
        System.out.print("Enter "+n+" element now : ");
        for(int i = 0; i<Array.length;i++){
            Array[i] = sc.nextInt();
        }
        int secondRepetitiveElement = gettin_The_SecondRepeatedElement(Array);
        if(secondRepetitiveElement!=-1){
            System.out.println("The second repetitive element in the given array is : "+secondRepetitiveElement);
        }else {
            System.out.println("There is no repetitive element in the given array ");
        }
    }
}
