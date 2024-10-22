import java.util.*;
/**
 * factorial
 */
public class factorial {

    public int factorial(int n){
        if (n==1 || n==0) {
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the NUmber thet you want to factorial: ");
        n=sc.nextInt();
        factorial f = new factorial();
        int fact=f.factorial(n);
        System.out.println(fact);
    }
}