import java.util.Scanner;

public class PrimeNumberUsingFunction {
    
    public static boolean isPrime(int n) {
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                System.out.println("The no "+n+" is not Prime Number.");
                return false;
            }
        }
        System.out.println("The number "+n+" is prime number");
        return true;
    }
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a;

        System.out.println("Enter the number a : ");
        a = sc.nextInt();

        boolean c = isPrime(a);
        System.out.println(c);
    }
}
