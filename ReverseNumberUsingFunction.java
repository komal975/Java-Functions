import java.util.Scanner;

public class ReverseNumberUsingFunction {
    
    public static int reverseNum(int n) {
        
        int digit;
        int revNum = 0;

        while(n > 0){

                digit = n % 10;
                revNum = revNum * 10 + digit;
                n = n / 10;

            }
            System.out.println("The reverse number is :" + revNum);
            return revNum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;

        System.out.println("Enter the number :");
        a = sc.nextInt();

        int c = reverseNum(a);
        System.out.println(c);
    }
}
