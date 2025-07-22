import java.util.Scanner;

public class SpyNumberUsingFunction {
    
    public static boolean isSpy(int n) {
        int sum = 0;
        int mult = 1;
        int digit,spyNum;

        spyNum = n;

        while(spyNum > 0) {
            digit = spyNum % 10;
            
            sum = sum + digit;
            mult = mult * digit;

            spyNum = spyNum / 10;
        }

        if(sum == mult) {
            System.out.println("The entered number " + n + " is Spy Number.");
            return true;
        }
        else {
            System.out.println("The entered number " + n + " is not Spy number.");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;

        System.out.println("Enter the number :");
        a = sc.nextInt();

        boolean c = isSpy(a);
        System.out.println(c);
    }
}
