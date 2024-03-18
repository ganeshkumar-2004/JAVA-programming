import java.util.Scanner;

public class primeNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int i, s;
        s =(int) Math.sqrt(num);
        for (i = 2; i <= s; i++) {
            if (num % i == 0)
                break;
        }
        if (i == s + 1)
            System.out.println("The Number is Prime");
        else
            System.out.println("The Number is NonPrime");

    }
}