import java.util.Scanner;

public class PalindromeNumberUsingFunction {

    public static boolean isPalindrome(int n) {

        int digit;
        int revNum = 0;
        int orgNum;

        orgNum = n;

        while(n > 0) {
            digit = n % 10;
            revNum = revNum * 10 + digit;
            n = n / 10;
        }

        if(orgNum == revNum) {
            System.out.println("Given Number and reverse number is Palindrome");
            return true;
        }
        else {
            System.out.println("Given Number and reverse number is not Palindrome");
            return false;
         }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;

        System.out.println("Enter the number :");
        a = sc.nextInt();

        boolean c = isPalindrome(a);
        System.out.println(c);

    }
}