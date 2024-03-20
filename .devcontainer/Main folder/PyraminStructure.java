import java.util.*;

public class PyraminStructure {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (j >= (n + 1) - i && j <= (n - 1) + i)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();

        }

    }
}