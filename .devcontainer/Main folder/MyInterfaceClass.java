import java.util.*;

/**
 * MyInterface
 */
interface MyInterface {

    // Method signatures
    void PrintEven();

    void PrintReverse();

    void Printaverage();
}

class MyClass implements MyInterface {
    public void PrintEven() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till that you want to find Even number :");
        int a = sc.nextInt();
        System.out.println("The even number is : ");
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public void PrintReverse() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ente the two digit number : ");
        int a = scan.nextInt();
        int b = a % 10;
        int c = (b * 10) + (a / 10);
        System.out.println("The reverse of the number is the : " + c);
    }

    public void Printaverage() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number till that you want to find the average : ");
        int Num = scan.nextInt();
        double average = 0.00;
        int sum = 0;
        for (int i = 1; i <= Num; i++) {
            sum = sum + i;
            average = sum / Num;
        }
        System.out.println("The average of the Numbers is : " + average);
    }
}

public class MyInterfaceClass {
    public static void main(String[] args) {
        MyClass MC = new MyClass();
        MC.PrintEven();
        MC.PrintReverse();
        MC.Printaverage();
    }
}