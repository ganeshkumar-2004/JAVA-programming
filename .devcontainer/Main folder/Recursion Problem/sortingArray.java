import java.util.*;
import java.util.Vector;

/**
 * sortingArray
 */
public class sortingArray {

    public static void sort(Vector<Integer> vec) {
        if (vec.size() == 0) {
            return;
        } else {
            int temp = vec.get(vec.size() - 1);
            vec.remove(vec.size() - 1);
            sort(vec);
            insertelement(vec, temp);
        }

    }

    public static void insertelement(Vector<Integer> vec, int temp) {
        if (vec.size() == 0 || vec.get(vec.size() - 1) <= temp) {
            vec.add(temp);
        } else {
            int val = vec.get(vec.size() - 1);
            vec.remove(vec.size() - 1);
            insertelement(vec, temp);
            vec.add(val);
        }
    }

    public static void main(String[] str) {

        Vector<Integer> v = new Vector<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the element of the Vector : ");
        int n = sc.nextInt();
        System.out.print("Enter the element of the Vector : ");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            v.add(element);

        }
        sortingArray.sort(v);
        System.out.print("The sorted vector is : ");
        for (Integer i : v) {
            System.out.print(i + " ");
        }
    }
}