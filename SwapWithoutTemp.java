public class SwapWithoutTemp {
    public static void main(String[] args) {
        int a = 9, b=3;
        System.out.printf("The values before swapping a=%d, b=%d",a,b);
        a =a+b;
        b= a-b;
        a = a-b;
        System.out.println();
        System.out.printf("The values before swapping a=%d, b=%d",a,b);
    }
}
