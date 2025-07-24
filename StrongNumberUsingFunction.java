import java.util.Scanner;

public class StrongNumberUsingFunction {

    public static int factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact = fact * i;
        }
        return fact;
    }

    public static boolean isStrong(int n) {

        int strongNum;
        int digit;
        
        int sum = 0;

        strongNum = n;

        while(strongNum > 0) {
            digit = strongNum % 10;
            sum = sum + factorial(digit);
            strongNum = strongNum / 10;
        }

        if(sum == n) {
            System.out.println("Entered number " + n + " is Strong Number");
            return true;
        }
        else {
            System.out.println("Entered number " + n + " is not Strong Number");
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;

        System.out.println("Enter the number :");
        a = sc.nextInt();

        boolean c = isStrong(a);
        System.out.println(c);
    }
    
}
