import java.util.Scanner;

public class AmstrongNumberUsingFuction {
 
    public static boolean isAmstrong(int n) {
        int orgNum,digit;
        int sum = 0;

        orgNum = n;

        while(orgNum > 0) {
            digit = orgNum % 10;
            sum = sum + (digit*digit*digit);
            orgNum = orgNum / 10;
        }

        if(sum == n) {
            System.out.println("The entered number " + n + " is Amstrong Number.");
            return true;
        }
        else {
            System.out.println("The entered number " + n + " is not Armstrong Number.");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;

        System.out.println("Enter the number :");
        a = sc.nextInt();

        boolean c = isAmstrong(a);
        System.out.println(c);
    }
}
