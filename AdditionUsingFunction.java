import java.util.Scanner;

public class AdditionUsingFunction {

    public static int Add(int a,int b){
        int c = a + b;
        return c;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;

        System.out.println("Enter value of a:");
        a = sc.nextInt();

        System.out.println("Enter the value of B:");
        b = sc.nextInt();

        int sum = Add(a,b);
        System.out.println(sum);
    }

}
