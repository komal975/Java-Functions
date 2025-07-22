import java.util.Scanner;

public class PerfectNumberUsingFunction {
    
    public static boolean isPerfect(int n) {
        int sum = 0;

        for(int i = 1; i < n; i++) {
            if(n % i == 0) {
                sum = sum + i;
            }
        }
        
        if(sum == n) {
                System.out.println("The entered number "+n+" is perfect number.");
                return true;
            }
            else {
                System.out.println("The entered number "+n+" is not perfect number.");  
                return false;          }
        
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a;

        System.out.println("Enter the number :");
        a = sc.nextInt();

        boolean c = isPerfect(a);
        System.out.println(c);
    }
}
