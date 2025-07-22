import java.util.Scanner;

public class FactorialOfNumberUsingFunction {
    
    public static int FactorialOfNumber(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            if(n != 0) {
                fact = fact * i;
            }
        }
        System.out.println("The factorial of number " + n + " is : "+fact);
        return fact;
    }
    

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int a;

        System.out.println("Enter the number :");
        a = sc.nextInt();

        int c = FactorialOfNumber(a);
        System.out.println(c);
    }

}
