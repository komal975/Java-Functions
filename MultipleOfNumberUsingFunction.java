import java.util.Scanner;

public class MultipleOfNumberUsingFunction {
    
    public static boolean multipleOf5(int n){
        return n % 5 == 0;
    }

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int a;

        System.out.println("Enter value of Number : ");
        a = sc.nextInt();

        boolean c = multipleOf5(a);
        System.out.println(c);
    }
}
