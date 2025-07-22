import java.util.Scanner;

public class NeonNumberUsingFunction {
    
    public static boolean isNeon(int n) {
        int digit,NeonNum;
        int square = 1;
        int sum = 0;

        NeonNum = n;

        while(NeonNum > 0) {
            square = NeonNum * NeonNum;
            digit = NeonNum % 10;
            sum = sum + NeonNum;
            NeonNum = NeonNum / 10;
        }

        if(sum == n) {
            System.out.println("The entered number " + n + " is Neon Number.");
            return true;
        }
        else {
             System.out.println("The entered number " + n + " is not Neon Number.");
             return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;

        System.out.println("Enter the number : ");
        a = sc.nextInt();

        boolean c = isNeon(a);
        System.out.println(c);
    }
}
