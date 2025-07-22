import java.util.Scanner;

public class EvenNumberUsingFunction {
    public static boolean isEven(int n){
        return n % 2 == 0;
    }

    public static void main(String[] args){
        int a;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of number :");
        a = sc.nextInt();
        
        boolean c = isEven(a);
        System.out.println(c);
    }
}
