public class SwappingValues {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        System.out.printf("a=%d ,b=%d",a,b);
        int c = a;
        a = b;
        b=c;
        System.out.println();
        System.out.printf("a=%d ,b=%d",a,b);
    }
}
