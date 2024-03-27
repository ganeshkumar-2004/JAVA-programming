import java.util.*;

// public class Array {

//     public static void main(String[] args) {
//         int[] num = new int[]{10,20,30,40,50};
//         System.out.println("Element of tha array is : ");
//         for (int i = 0; i < num.length; i++) {
//             System.out.println(num[i]);
//         }
//     }
// }
public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size=sc.nextInt();
        int arr[] = new int[size];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt();
        }
        System.out.println("The element of  array is : ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
        }

    
    }
}