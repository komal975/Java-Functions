import java.util.Scanner;

public class OddNumberUsingFunction {
    
    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a;

        System.out.print("Enter the number : ");
        a = sc.nextInt();

        boolean c = isOdd(a);
        System.out.println(c);

    }
}
