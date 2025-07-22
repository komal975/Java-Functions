import java.util.Scanner;

public class HarshadNumberUsingFunction {
    
    public static boolean isHarshad(int n) {
        int harshNum;
        int digit;
        int sum = 0;

        harshNum = n;

        while(harshNum > 0) {
            digit = harshNum % 10;
            sum = sum + digit;
            harshNum = harshNum / 10;
        }

        if(n % sum == 0) {
            System.out.println("The entered number " + n + " is Harshal Number");
            return true;
        }

        else {
            System.out.println("The entered number " + n + " is not Harshal Number");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;

        System.out.println("Enter the number : ");
        a = sc.nextInt();

        boolean c = isHarshad(a);
        System.out.println(c);
    }
}
